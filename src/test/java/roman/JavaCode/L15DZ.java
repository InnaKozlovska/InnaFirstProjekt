package roman.JavaCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class L15DZ {
    //! Создать список из чисел и заполнить его на 5 элементов с консоли. Вывести все элементы списка в консоль.
//    public static void main(String[] args) {
//        List<Integer> listOfValues = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть  пять інтових чисел!");
//        for (int i = 1; i < 6; i++) {
//            System.out.println("введіть " + i + " число!");
//            Integer newItemOfList = scanner.nextInt();
//            listOfValues.add(newItemOfList);
//        }
//        System.out.println("Ось числа які ви ввели: ");
//        System.out.println(listOfValues);
//    }

    //! 1. Создай список строк.
    //! 2. Добавь в него 5 различных строчек с консоли.
    //! 3. Выведи его размер на экран.
    //! 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
//    public static void main(String[] args) {
//        List<String> listOfValues = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть пять слів!");
//        for (int i = 1; i < 6; i++) {
//            System.out.println("введіть " + i + " слово!");
//            String newItemOfList = scanner.nextLine();
//            listOfValues.add(newItemOfList);
//        }
//        System.out.println("Слів було введено: " + listOfValues.size());
//        System.out.println("Такі слова були введені: ");
//        for (int i = 0; i < listOfValues.size(); i++) {
//            System.out.println(listOfValues.get(i));
//        }
//    }

    //! Создать список из целых чисел и заполнить его с консоли
    //! Ввод целых чисел с клавиатуры продолжается, пока не ввели пустую строку в консоли
    //! После того, как ввод завершён - вывести все элементы списка в консоль
//    public static void main(String[] args) {
//        List<Integer> listOfValues = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть інтові чисела!");
//        System.out.println("Щоб зупинитись введіть пусту стрічку!");
//        while (true) {
//            String input = scanner.nextLine();
//            if (input.isEmpty()) {
//                break;
//            }
//            listOfValues.add(Integer.parseInt(input));
//        }
//        System.out.println("Елементи списку: ");
//        for (int i = 0; i < listOfValues.size(); i++) {
//            System.out.println(listOfValues.get(i));
//        }
//    }

    //! Создать список чисел и заполнить его с консоли следующим образом:
    //! чётные числа добавляют в конец списка, нечётные — в начало.
//    public static void main(String[] args) {
//        List<Integer> listOfValues = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть інтові чисела!");
//        System.out.println("Щоб зупинитись введіть пусту стрічку!");
//        while (true) {
//            String input = scanner.nextLine();
//            if (input.isEmpty()) {
//                break;
//            }
//            int number = Integer.parseInt(input);
//            if (number % 2 == 0) {
//                listOfValues.add(number);
//            }
//            else {
//                listOfValues.add(0,number);
//            }
//        }
//        System.out.println(listOfValues);
//    }

    //! Создать список чисел и заполнить его с консоли
    //! Удалить все числа больше 5
//    public static void main(String[] args) {
//        List<Integer> listOfValues = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть інтові чисела!");
//        System.out.println("Щоб зупинитись введіть пусту стрічку!");
//        while (true){
//            String input = scanner.nextLine();
//            if (input.isEmpty()){
//                break;
//            }
//            int number = Integer.parseInt(input);
//            if (number < 6){
//                listOfValues.add(number);
//            }
//        }
//        System.out.println(listOfValues);
//    }

    //! Создать список чисел и заполнить его с консоли
    //! Разбить список на два других:
    //!- в первый список сохранять чётные числа
    //!- во второй список сохранять нечётные числа
    //!Вывести содержимое всех списков в консоль. Каждый новый список выводить с новой строки, в ряд.
//    public static void main(String[] args) {
//        List<Integer> listOfValuesEven = new ArrayList<>(); //парні
//        List<Integer> listOfValuesOdd = new ArrayList<>();  //непарні
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть інтові чисела!");
//        System.out.println("Щоб зупинитись введіть пусту стрічку!");
//        while (true) {
//            String input = scanner.nextLine();
//            if (input.isEmpty()) {
//                break;
//            }
//            int number = Integer.parseInt(input);
//            if (number % 2 == 0) {
//                listOfValuesEven.add(number);
//            } else {
//                listOfValuesOdd.add(number);
//            }
//        }
//        System.out.println("парні: " + listOfValuesEven);
//        System.out.println("непарні: " + listOfValuesOdd);
//    }

    //! 1. Создай список строк.
    //! 2. Считай с клавиатуры 5 строк и добавь в список.
    //! 3. Используя цикл, найди самую длинную строку в списке.
    //! 4. Выведи найденную строку на экран.
    //! 5. Если таких строк несколько, выведи каждую с новой строки.
//    public static void main(String[] args) {
//        List<String> listOfValues = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть пять інтових чисел!");
//        System.out.println("Щоб зупинитись введіть пусту стрічку!");
//        while (true) {
//            String imput = scanner.nextLine();
//            if (imput.isEmpty()) {
//                break;
//            }
//            listOfValues.add(imput);
//
//        }
//
//        System.out.println(listOfValues);


    //            int maxLength = 0;
//            for (int i = 0; i<= listOfValues.size(); i++){
//                if (listOfValues.get(0).length() > maxLength){
//                    maxLength = listOfValues.get(0)
//                }
//            }
//        }
//        System.out.println(listOfValues);
//    }
//}


    //! 1. Создай список строк.
    //! 2. Считай с клавиатуры 5 строк и добавь в список.
    //! 3. Используя цикл, найди самую короткую строку в списке.
    //! 4. Выведи найденную строку на экран.
    //! 5. Если таких строк несколько, выведи каждую с новой строки.






    //! 1. Введи с клавиатуры 6 чисел, сохрани их в список и рассортируй по трём другим спискам:
    //! Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    //! Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
    //! 2. Создай метод printList - он должен выводить на экран все элементы списка с новой строки.
    //! 3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3,
    //! потом тот, который для x%2, потом последний.

}

