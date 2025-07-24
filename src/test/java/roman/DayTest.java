package roman;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.stream.Stream;


public class DayTest {

    public enum Day {
        MONDAY("Понеділок", true),
        TUESDAY("Вівторок", true),
        WEDNESDAY("Середа", true),
        THURSDAY("Четвер", true),
        FRIDAY("П’ятниця", true),
        SATURDAY("Субота", false),
        SUNDAY("Неділя", false);

        private final String ukrainianName;
        private final boolean isWorkingDay;

        Day(String ukrainianName, boolean isWorkingDay) {
            this.ukrainianName = ukrainianName;
            this.isWorkingDay = isWorkingDay;
        }

        public String getUkrainianName() {
            return ukrainianName;
        }

        public boolean isWorkingDay() {
            return isWorkingDay;
        }
    }

    @DataProvider(name = "daysStreamProvider")
    public Object[][] provideDaysWithStream() {
        return Stream.of(Day.values())
                .map(day -> new Object[]{day, day.getUkrainianName(), day.isWorkingDay()})
                .toArray(Object[][]::new);
    }

    @Test(dataProvider = "daysStreamProvider")
    public void testDayStream(Day day, String ukrName, boolean isWorking) {
        System.out.printf("Enum: %s | Назва: %s | Робочий день? %s%n",
                day.name(), ukrName, isWorking);
    }
}

