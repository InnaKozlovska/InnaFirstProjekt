package roman.romanarhive;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {

    // в параметири передається інформація звідки береться інформація
    @Test(dataProvider = "users")
    // в параметрах описуємо що будемо виводити на екран
    public void loginTest(String username, String password) {
        System.out.println("Username: " + username + ", Password: " + password);
    }

    @DataProvider
    // 1. Масив Object[][] (найпоширеніший варіант)
    // 2. Ітератор Iterator<Object[]> (зручно при великій кількості даних)
    // 3. Підтягування даних із файлів (наприклад, CSV, Excel, JSON)
    public Object[][] users() {
        return new Object[][]{
                {"user1", "pass1"},
                {"user2", "pass2"},
                {"user3", "pass3"}
        };


    }
}
