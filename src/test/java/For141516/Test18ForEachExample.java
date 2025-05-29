package For141516;

import java.util.ArrayList;
import java.util.List;

public class Test18ForEachExample {

        public static void main(String[] args) {

            List<Person> personlist = new ArrayList<>();
            personlist.add(new Person("Ivan", 35, "man", "sport"));
            personlist.add(new Person("Kola", 45, "woman", "dance"));



//            for (Person i : personlist) {
//                System.out.println("Iмя - " + i.name + " / Вік - " + i.age);
//            }
            Person person = personlist.get(0);
            System.out.println("Iмя - " + person.name + " / Вік - " + person.age);
//            person.hobby; записати ??

        }
    }

