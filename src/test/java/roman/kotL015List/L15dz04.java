package roman.kotL015List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L15dz04 {
    // Создать список чисел и заполнить его с консоли следующим образом:
    // чётные числа добавляют в конец списка, нечётные — в начало.
    public static void main(String[] args) {
        List<Integer> listOfValues = new ArrayList<>();
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
                listOfValues.add(number);
            } else {
                listOfValues.add(0, number);
            }
        }
        System.out.println(listOfValues);
    }
}
