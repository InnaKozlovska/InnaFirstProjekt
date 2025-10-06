package Lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les8ForWhileDoWhile {
    // цикли for, while, do while
    //створ.перемінна і, їй присвоюється 0
    //перед кожною ітерацією відбув.перевірка і<10
    //sout і інкремент і++(збільш.на одиничку)
    //break використовується коли необхідно обірвати виконання циклу
    //continue дозволяє пропустити 1 ітерацію циклу

    public static void main(String[] args) throws IOException {
       /* for (int i = 0; i <10; i++){

            System.out.println("text");
        }*/

        //while цикл
//        int i =0;
//        while (i<10){
//            System.out.println("text " + i);
//            i++;
//        }

//        //do While виконується мін 1 раз
//        //він спочатку виконує код, а потім перевіряє умову
//        int d = 0;
//        do {
//            System.out.println("read " + d);
//            d++;
//        } while (d < 10);

//        //
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String str = reader.readLine();
//        while (!str.equals("exit") ){     // поки str не дорівнює exit даний цикл виконується
//            System.out.println(str);
//            str = reader.readLine();
//        }

//        //break зупиняє цикл for
//        for (int i = 0; i <5; i++){
//            if (i == 5){
//                break;
//            }
//            System.out.println("text"+i);
//        }
//        System.out.println("end");

        //continue дозволяє пропустити 1 ітерацію циклу
        for (int i = 0; i <5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("text" +i);

        }


    }
}
