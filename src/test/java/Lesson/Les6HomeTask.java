package Lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les6HomeTask {
    public Les6HomeTask() throws IOException {
    }
    /*
Ввести с клавиатуры число n.
Вывести на экран надпис «Я зарабатываю $n в час».
Приклад:
Я буду зарабатывать $50 в час
*/

/*
Ввести с клавиатуры окремо Имя, число1, число2. Вывести надпис: «Имя» буде получать «число1» через «число2» лет.
Приклад:
Alex буде получать 4000 через 5 лет.
*/

    public static void main(String[] args) throws IOException {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(reader.readLine());
//        System.out.println("я заробляю " + n + "$ в годину");


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println(name + " буде отримувати в $" + num1 + " через " + num2 + " роки" );

    }



}
