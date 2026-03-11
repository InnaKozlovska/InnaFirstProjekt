package roman.kotL10Array;

//Создать и заполнить массив из 10 чисел, значениями от 10 до 19

public class L10dz3 {
    public static void main(String[] args) {
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 + i;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
