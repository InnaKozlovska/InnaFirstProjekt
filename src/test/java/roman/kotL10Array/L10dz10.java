package roman.kotL10Array;

//1. В методе initializeArray():
//1.1. Создайте массив на 10 чисел
//1.2. Считайте с консоли 10 чисел и заполните ими массив
//2. Метод max(int[] array) должен находить максимальное число из элементов массива
//3. В выполняющем методе main выведите максимальное число в консоль

import java.util.Scanner;

public class L10dz10 {

    public static int[] initializeArray() {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = initializeArray();
        int maximum = max(array);
        System.out.println(maximum);
    }
}
