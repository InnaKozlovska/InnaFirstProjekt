package roman.JavaCode;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//* while з інтами
//    while (true) {
//        Integer input = scanner.nextInt();
//        if (input == 0) {
//            break;
//        }
//    }

public class L17DZ {
    //! Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
    //! Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
    //! Программа выводит содержимое нового списка на экран.
    //! Пример ввода:
    //! Кот
    //! Коты
    //! Я
    //! Пример вывода:
    //! Кот Кот Кот
    //! Коты Коты
    //! Я Я Я
//    public static void main(String[] args) {
//        Set<String> wordsList = new LinkedHashSet<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть слова (завершення через введення пустої стрічки.");
//        while (true) {
//            String input = scanner.nextLine();
//            if (input.isEmpty()) {
//                break;
//            }
//            wordsList.add(input);
//
//        }
//        for (String word : wordsList) {
//            if (word.length() % 2 == 0) {
//                System.out.println(word + " " + word);
//            } else {
//                System.out.print(word + " " + word + " " + word);
//            }
//        }
//    }

    //! Ввести с клавиатуры 5 чисел и заполнить ими список.
    //! Вывести их в обратном порядке.
    //! Использовать только цикл for.
//    public static void main(String[] args) {
//        Set<Integer> numbersList = new LinkedHashSet<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введіть пять інтових чисел (без їх повторення");
//        for (int in = 0; in < 5; in++) {
//            Integer input = scanner.nextInt();
//            numbersList.add(input);
//        }
//        System.out.println("Ви ввели " + numbersList.size() + " чиел.");
//        //конвертуємо в масив
//        Integer[] numbersArray = numbersList.toArray(new Integer[0]);
//        for (int out = numbersArray.length - 1; out >= 0; out--) {
//            System.out.println(numbersArray[out]);
//        }
//    }

    //! Ввести с клавиатуры 2 числа N  и M.
    //! Ввести N строк и заполнить ими список.
    //! Переставить M первых строк в конец списка.
    //! Вывести список на экран, каждое значение с новой строки.
    public static void main(String[] args) {
        
    }


    //! Создать массив на 5 чисел.
    //! Заполнить его числами с клавиатуры.
    //! Найти максимальное и минимальное числа в массиве.
    //! Вывести на экран максимальное и минимальное числа через пробел.



    //! Создать список строк.
    //! Ввести строки с клавиатуры и добавить их в список.
    //! Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
    //! Вывести строки на экран, каждую с новой строки.



     //! Посчитать сколько прошло времени с начала сегодняшнего дня. Используйте класс Date.



     //! Посчитать сколько дней прошло с начала года. Используйте класс LocalDate.



    //! Реверс числа
    //! 1) Ввести число с клавиатуры
    //! 2) Сделать реверс этого числа и вывести результат в консоль
    //! Пример:
    //! входные данные: -5544
    //! результат: -4455


}
