package roman.kotL17Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class L17dz02 {
    // Ввести с клавиатуры 5 чисел и заполнить ими список.
    // Вывести их в обратном порядке.
    // Использовать только цикл for.
    public static void main(String[] args) {
        Set<Integer> numbersList = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть пять інтових чисел (без їх повторення");
        for (int in = 0; in < 5; in++) {
            Integer input = scanner.nextInt();
            numbersList.add(input);
        }
        System.out.println("Ви ввели " + numbersList.size() + " чиел.");
        //конвертуємо в масив
        Integer[] numbersArray = numbersList.toArray(new Integer[0]);
        for (int out = numbersArray.length - 1; out >= 0; out--) {
            System.out.println(numbersArray[out]);
        }
    }
}
