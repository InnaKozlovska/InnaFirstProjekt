package arhiveOldClasses;

import java.util.ArrayList;
import java.util.List;

public class ForTest18ForEachExample {

        public static void main(String[] args) {

            List<ForPerson> personlist = new ArrayList<>();
            personlist.add(new ForPerson("Ivan", 35, "man", "sport"));
            personlist.add(new ForPerson("Kola", 45, "woman", "dance"));



//            for (Person i : personlist) {
//                System.out.println("Iмя - " + i.name + " / Вік - " + i.age);
//            }
            ForPerson person = personlist.get(0);
            System.out.println("Iмя - " + person.name + " / Вік - " + person.age);
//            person.hobby; записати ??

        }
    }

