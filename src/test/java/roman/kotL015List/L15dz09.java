package roman.kotL015List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L15dz09 {
    // 1. Введи с клавиатуры 6 чисел, сохрани их в список и рассортируй по трём другим спискам:
    // Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
    // Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
    // 2. Создай метод printList - он должен выводить на экран все элементы списка с новой строки.
    // 3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3,
    // потом тот, который для x%2, потом последний.

    public static void main(String[] args) {
        List<Integer> listOfValues = new ArrayList<>();
        List<Integer> listDivBy3 = new ArrayList<>();
        List<Integer> listDivBy2 = new ArrayList<>();
        List<Integer> listOthers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int input = scanner.nextInt();
            listOfValues.add(input);
        }
        for (int item : listOfValues) {
            if (item % 3 == 0) {
                listDivBy3.add(item);
            } else if (item % 2 == 0) {
                listDivBy2.add(item);
            } else {
                listOthers.add(item);
            }
        }
        System.out.println("Всі введені числа: " + listOfValues);
        System.out.println("Числа які діляться на 3: " + listDivBy3);
        System.out.println("Числа які діляться на 2: " + listDivBy2);
        System.out.println("Всі інші числа: " + listOthers);

    }
}
