package roman.romanjavainfo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInfo {
    //! Використовуйте ArrayList для зберігання та доступу до даних і LinkedList для маніпулювання даними.
    //! У класі ArrayList є звичайний масив.
    //! Коли елемент додається, він розміщується в масиві.
    //! Якщо масив недостатньо великий, замість старого створюється новий, більший масив, а старий видаляється.

    //! ArrayList<String> cars = new ArrayList<String>(); // Створити об’єкт ArrayList


//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//    }

    //! Доступ до елемента  cars.get(0);
    //! Змінити елемент cars.set(0, "Opel");
    //! Видалити елемент    cars.remove(0);
    //! Видалити всі елементи   cars.clear();
    //! Розмір ArrayList    cars.size();
    //! Перебрати ArrayList
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }
//    }
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        for (String i : cars) {
//            System.out.println(i);
//        }
//    }

    //! Сортування ArrayList
//    public static void main(String[] args) {
//        ArrayList<String> cars = new ArrayList<String>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        Collections.sort(cars);  // Сортування cars
//        for (String i : cars) {
//            System.out.println(i);
//        }
//    }

    //! Сортувати ArrayList цілих чисел
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Сортування myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }

}

