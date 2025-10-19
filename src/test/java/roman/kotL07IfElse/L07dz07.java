package roman.kotL07IfElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L07dz07 {
    /*
     Реализовать метод closeToFive.
     Метод должен выводить на экран ближайшее к 5 из двух чисел, записанных в
     аргументах метода. Например, среди чисел 3 и 6 ближайшее к пяти 6.
     Если оба числа на равной длине к 5, то вывести на экран любое из них.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        closeToFive(number1, number2);
    }

    public static void closeToFive(int number1, int number2) {
        int mainNubmer = 5;
        int diffNumber1 = Math.abs(mainNubmer - number1);
        int diffNumber2 = Math.abs(mainNubmer - number2);

        if (diffNumber1 < diffNumber2) {
            System.out.println("Ближче до " + mainNubmer + " число " + number1);
        } else if (diffNumber1 > diffNumber2) {
            System.out.println("Ближче до " + mainNubmer + " число " + number2);
        } else {
            System.out.println("числа рівновіддалені ");
        }
    }
}
