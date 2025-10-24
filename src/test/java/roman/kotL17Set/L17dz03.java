package roman.kotL17Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class L17dz03 {
    // Ввести с клавиатуры 2 числа N  и M.
    // Ввести N строк и заполнить ими список.
    // Переставить M первых строк в конец списка.
    // Вывести список на экран, каждое значение с новой строки.
    public static void main(String[] args) {
        Set<String> wordsList = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість слів, яку потрібно записати в масив ");
        int listSize = scanner.nextInt();//N
        System.out.println("Введіть кількість слів, яку потрібно перенести в масиві з початку в кінець");
        int moveWords = scanner.nextInt();//M
        //очистити буфер сканера
        scanner.nextLine();
        System.out.println("Введіть " + listSize + " рядків");
        //записуємо в масив
        for (int i = 0; i < listSize; i++) {
            wordsList.add(scanner.nextLine());
        }
        for (int i = 0;i<moveWords;i++){
//            String first = wordsList.remove(0);

        }


        System.out.println(wordsList);
    }
}
