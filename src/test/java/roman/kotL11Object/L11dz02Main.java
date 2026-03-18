package roman.kotL11Object;

/*
В методе initializeArray():
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
В методе printArray():
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/


import java.util.Scanner;

public class L11dz02Main {
    public static String[] initializeArray() {
        String[] array = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextLine();
        }
        return array;
    }

    public static void printArray(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        String[] array = initializeArray();
        printArray(array);
    }

}
