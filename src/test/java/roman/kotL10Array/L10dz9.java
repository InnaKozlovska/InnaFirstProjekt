package roman.kotL10Array;

//Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
//Найти минимальный элемент в массиве и вывести его в консоль.


public class L10dz9 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int min = arr[0];
        for (int i = 1; i < min; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);


    }
}
