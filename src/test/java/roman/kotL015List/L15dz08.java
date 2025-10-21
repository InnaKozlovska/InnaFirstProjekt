package roman.kotL015List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L15dz08 {
    // 1. Создай список строк.
    // 2. Считай с клавиатуры 5 строк и добавь в список.
    // 3. Используя цикл, найди самую короткую строку в списке.
    // 4. Выведи найденную строку на экран.
    // 5. Если таких строк несколько, выведи каждую с новой строки.

    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слова! Щоб зупинити введення введіть пусту стрічку! ");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            listOfStrings.add(input);
        }
        int minLength = listOfStrings.get(0).length();
        for (String valueFromList : listOfStrings) {
            if (valueFromList.length() < minLength) {
                minLength = valueFromList.length();
            }
        }
        System.out.println("Ось найкоротші слова з введеного списку: ");
        for (String valueFromList : listOfStrings) {
            if (valueFromList.length() == minLength) {
                System.out.println(valueFromList);
            }
        }
    }
}
