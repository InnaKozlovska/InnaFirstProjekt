package roman.kotL10Array;

//Ввести 5 чисел с клавиатуры и записать их в массив
//Вывести содержимое массива в консоль


import java.util.Scanner;

public class L10dz6 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
