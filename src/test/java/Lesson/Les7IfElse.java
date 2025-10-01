package Lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les7IfElse {
    //умовні оператори, щоб перевірити: якщо значення змінної >10, то виводиться на екран результат

    public static void main(String[] args) throws IOException {

//        int a = 8;
//        if ( a > 10){                   //програма по черзі перевіряє умови, що написані в if
//            System.out.println("gut");
//        }
//        else if (a < 10) {
//            System.out.println("bad"); //виконується else
//        }

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //створюється обєкт для
//        //зчитування тексту з клавіатури
//        System.out.println("Введіть ваш вік ");
//        int age = Integer.parseInt(reader.readLine());// reader.readLine читається рядок(типу String) з консолі,
//        Alt+Enter забрати помилку компіляції
//        //integer.parseInt - перетворює рядок у число

        //логічні операції < >; == (дорівнює); != (не дорівнює); && (i); ||(або)
//        if (age >=18){
//            System.out.println("Вивести контент");
//        }else {
//            System.out.println("No content!");
//        }

        //якщо потрібно вказати діапазон і об'єднати умови, то використовується && (i),
        // але має виконуватися дві умови
        // при || (або) має виконуватися хоча б одна умова
        // | і & перевіряють обидві умови
//        if (age >=18 && age <=30){
//            System.out.println("Вивести ......");
//        }else {
//            System.out.println("No content!");
//        }

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввести...");
        int num1 = Integer.parseInt(reader1.readLine());
        int num2 = Integer.parseInt(reader1.readLine());
        if (num1 < num2){
            System.out.println(num1);
        }else if (num2 < num1){
            System.out.println(num2);
        }


    }
}
