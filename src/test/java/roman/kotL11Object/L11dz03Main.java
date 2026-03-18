package roman.kotL11Object;

/*
1. Создать массив на 5 строк.
2. Создать массив на 5 чисел.
3. Ввести с клавиатуры 5 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
 индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

import java.util.Scanner;

public class L11dz03Main {
    public static void main(String[] args) {
        String[] arrStr = new String[5];
        int[] arrInt = new int[5];
        Scanner scStr = new Scanner(System.in);
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = scStr.nextLine();
        }

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = arrStr[i].length();
        }

        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + " ");
        }

    }

}