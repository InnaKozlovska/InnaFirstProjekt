package roman.kotL015List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L15dz01 {
    //! Создать список из чисел и заполнить его на 5 элементов с консоли. Вывести все элементы списка в консоль.
    public static void main(String[] args) {
        List<Integer> listOfValues = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть  пять інтових чисел!");
        for (int i = 1; i < 6; i++) {
            System.out.println("введіть " + i + " число!");
            Integer newItemOfList = scanner.nextInt();
            listOfValues.add(newItemOfList);
        }
        System.out.println("Ось числа які ви ввели: ");
        System.out.println(listOfValues);
    }
}
