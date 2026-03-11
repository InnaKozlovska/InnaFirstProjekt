package roman.kotL10Array;

public class L10Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        arr[6] = 7;
        System.out.println(arr[0]);

        System.out.println("\n ВИВОДЖУ МАСИВ ЧЕРЕЗ ЦИКЛ ФОР");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("\n ЗАПИС В МАСИВ ЧИСЕЛ ВІД 1 ДО 10");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("\n ЗАПОВНЕННЯ ДВОМІРНОГО МАСИВУ");
        int[][] array2 = new int[3][3];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("МАСИВ " + i);
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j]);
            }
        }

    }
}
