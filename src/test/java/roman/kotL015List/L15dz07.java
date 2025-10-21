package roman.kotL015List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L15dz07 {
    // 1. Создай список строк.
    // 2. Считай с клавиатуры 5 строк и добавь в список.
    // 3. Используя цикл, найди самую длинную строку в списке.
    // 4. Выведи найденную строку на экран.
    // 5. Если таких строк несколько, выведи каждую с новой строки.

    public static void main(String[] args) {
        List<String> listOfValues = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слова. Щоб зупинитись введіть пусту стрічку!");
        while (true) {
            String imput = scanner.nextLine();
            if (imput.isEmpty()) {
                break;
            }
            listOfValues.add(imput);
        }
        int maxLength = listOfValues.get(0).length();
        for (String valueFromList : listOfValues) {
            if (valueFromList.length() > maxLength) {
                maxLength = valueFromList.length();
            }
        }
        System.out.println("Ось найдовші слова з введеного списку: ");
        for (String valueFromList : listOfValues) {
            if (valueFromList.length() == maxLength) {
                System.out.println(valueFromList);
            }
        }
    }
}
