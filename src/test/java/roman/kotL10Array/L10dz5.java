package roman.kotL10Array;

//Ввести 5 строк с клавиатуры и записать их в массив

import java.util.Scanner;

public class L10dz5 {
    public static void main(String[] args) {
        String arr[] = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
//            String item = sc.nextLine();
//            arr[i] = item;
            arr[i] = sc.nextLine();
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
