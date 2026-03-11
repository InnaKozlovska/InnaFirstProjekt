package roman.kotL10Array;

//Создать и заполнить массив из 10 чисел, значениями от 29 до 20

public class L10dz4 {
    public static void main(String[] args) {
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 29 - i;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
