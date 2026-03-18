package roman.kotL11Object;

/*
1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

import java.util.Arrays;
import java.util.Scanner;

public class L11dz04Main {
    public static void main(String[] args) {
        int[] arrInt = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = sc.nextInt();
        }
        int[] arrInt1st = new int[5];
        int[] arrInt2nd = new int[5];

        for (int i = 0; i < 5; i++) {
            arrInt1st[i] = arrInt[i];
            arrInt2nd[i] = arrInt[i + 5];
        }
        System.out.println(Arrays.toString(arrInt1st));
        System.out.println(Arrays.toString(arrInt2nd));

    }
}
