package roman.romanjavainfo;

import java.util.HashMap;

public class HashMapInfo {
    //! HashMap зберігає елементи в парах «ключ/значення»,
    //!     і ви можете отримати доступ до них за індексом іншого типу (наприклад, String).
    //! Один об’єкт використовується як ключ (індекс) для іншого об’єкта (значення).
    //! Він може зберігати різні типи:
    //!     ключі String і значення Integer або один і той самий тип, наприклад: ключі String і значення String.

    //! Додати елементи
    public static void main(String[] args) {
        // Створити об’єкт HashMap під назвою capitalCities
        HashMap<String, String> capitalCities = new HashMap<>();

        // Додати ключі та значення (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
    }

    //! Доступ до елемента  capitalCities.get("England");
    //! Видалити елемент    capitalCities.remove("England");
    //! Видалити всі елементи   capitalCities.clear();
    //! HashMap Розмір  capitalCities.size();

    //! Перебирайте елементи HashMap за допомогою циклу for-each.
    //! використовуйте метод keySet(), якщо вам потрібні лише ключі,
    //!     і використовуйте values(), якщо вам потрібні лише значення.
    // Надрукувати ключі
    //    for(String i :capitalCities.keySet())    {
    //        System.out.println(i);
    //    }
    // Надрукувати значення
    //    for (String i : capitalCities.values()) {
    //        System.out.println(i);
    //    }

    //! Ключі та значення в HashMap насправді є об’єктами.
    //! Рядок у Java є об’єктом (а не примітивним типом).
    //! Щоб використовувати інші типи, такі як int, ви повинні вказати еквівалентний клас оболонки: Integer.
//    public static void main(String[] args) {
//
//        // Створіть об’єкт HashMap під назвою people
//        HashMap<String, Integer> people = new HashMap<String, Integer>();
//
//        // Додайте ключі та значення (Name, Age)
//        people.put("John", 32);
//        people.put("Steve", 30);
//        people.put("Angie", 33);
//
//        for (String i : people.keySet()) {
//            System.out.println("key: " + i + " value: " + people.get(i));
//        }
//    }


}
