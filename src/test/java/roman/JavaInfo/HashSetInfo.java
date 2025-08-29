package roman.JavaInfo;

import java.util.HashSet;

public class HashSetInfo {
    //! Хеш-сет (HashSet) — це колекція елементів, де кожен елемент унікальний і знаходиться в java.utilпакеті:
    // HashSet<String> cars = new HashSet<String>();
    //! Додати елементи
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }

    //! Перевірити, чи існує елемент    cars.contains("Mazda");
    //! Видалити елемент    cars.remove("Volvo");
    //! Видалити всі елементи   cars.clear();
    //! HashSet Розмір  cars.size();
    //! Перехід через хеш-сет
//    for (String i : cars) {
//        System.out.println(i);
//    }

    //! Елементи в HashSet насправді є об'єктами.
//    public static void main(String[] args) {
//
//        // Create a HashSet object called numbers
//        HashSet<Integer> numbers = new HashSet<Integer>();
//
//        // Add values to the set
//        numbers.add(4);
//        numbers.add(7);
//        numbers.add(8);
//
//        // Show which numbers between 1 and 10 are in the set
//        for(int i = 1; i <= 10; i++) {
//            if(numbers.contains(i)) {
//                System.out.println(i + " was found in the set.");
//            } else {
//                System.out.println(i + " was not found in the set.");
//            }
//        }
//    }


}
