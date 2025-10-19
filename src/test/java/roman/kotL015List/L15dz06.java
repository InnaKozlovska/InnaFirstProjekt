package roman.kotL015List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L15dz06 {
    // Создать список чисел и заполнить его с консоли
    // Разбить список на два других:
    //- в первый список сохранять чётные числа
    //- во второй список сохранять нечётные числа
    //  Вывести содержимое всех списков в консоль. Каждый новый список выводить с новой строки, в ряд.
    public static void main(String[] args) {
        List<Integer> listOfValuesEven = new ArrayList<>(); //парні
        List<Integer> listOfValuesOdd = new ArrayList<>();  //непарні
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть інтові чисела!");
        System.out.println("Щоб зупинитись введіть пусту стрічку!");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            int number = Integer.parseInt(input);
            if (number % 2 == 0) {
                listOfValuesEven.add(number);
            } else {
                listOfValuesOdd.add(number);
            }
        }
        System.out.println("парні: " + listOfValuesEven);
        System.out.println("непарні: " + listOfValuesOdd);
    }
}
