package roman.kotL17Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class L17dz01 {
    // Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
    // Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
    // Программа выводит содержимое нового списка на экран.
    // Пример ввода:
    // Кот
    // Коты
    // Я
    // Пример вывода:
    // Кот Кот Кот
    // Коты Коты
    // Я Я Я
    public static void main(String[] args) {
        Set<String> wordsList = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слова (завершення через введення пустої стрічки.");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            wordsList.add(input);

        }
        for (String word : wordsList) {
            if (word.length() % 2 == 0) {
                System.out.println(word + " " + word);
            } else {
                System.out.print(word + " " + word + " " + word);
            }
        }
    }
}
