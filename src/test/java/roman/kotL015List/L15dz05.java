package roman.kotL015List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L15dz05 {
    // Создать список чисел и заполнить его с консоли
    // Удалить все числа больше 5
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
            if (number < 6) {
                listOfValues.add(number);
            }
        }
        System.out.println(listOfValues);
    }
}
