package roman.kotL10Array;

//Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
//Посчитать сумму элементов массива и вывести её на экран.

public class L10dz8 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int summArrey = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        System.out.println(summArrey);
    }
}
