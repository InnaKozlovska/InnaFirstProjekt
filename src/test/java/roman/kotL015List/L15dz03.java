package roman.kotL015List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L15dz03 {
    // Создать список из целых чисел и заполнить его с консоли
    // Ввод целых чисел с клавиатуры продолжается, пока не ввели пустую строку в консоли
    // После того, как ввод завершён - вывести все элементы списка в консоль
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
            listOfValues.add(Integer.parseInt(input));
        }
        System.out.println("Елементи списку: ");
        for (int i = 0; i < listOfValues.size(); i++) {
            System.out.println(listOfValues.get(i));
        }
    }
}
