package arhiveOldClasses;

public class ForTest17 {


    public static void main(String[] args) {

//        for (int i=1; i<=20; i++) {
//            if (i==7) {
//                break;// закінчує роботу циклу коли і стане 5
//            }
//            System.out.println(i);
//        }

        for (int i = 1; i <= 100; i++) {
            if (i == 57) {
                continue; // виводить значення від 1до 100, крім 57
            }
            System.out.println(i);
        }

    }
}