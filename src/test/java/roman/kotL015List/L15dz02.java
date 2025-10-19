package roman.kotL015List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L15dz02 {
    // 1. Создай список строк.
    // 2. Добавь в него 5 различных строчек с консоли.
    // 3. Выведи его размер на экран.
    // 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
    public static void main(String[] args) {
        List<String> listOfValues = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть пять слів!");
        for (int i = 1; i < 6; i++) {
            System.out.println("введіть " + i + " слово!");
            String newItemOfList = scanner.nextLine();
            listOfValues.add(newItemOfList);
        }
        System.out.println("Слів було введено: " + listOfValues.size());
        System.out.println("Такі слова були введені: ");
        for (int i = 0; i < listOfValues.size(); i++) {
            System.out.println(listOfValues.get(i));
        }
    }
}
