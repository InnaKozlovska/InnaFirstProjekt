package roman.kotL07IfElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L07dz01 {
    /*
    Ввести с клавиатуры два числа, вывести на экран максимальное из них.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть перше число для порівняння");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Введіть друге число для порівняння");
        int num2 = Integer.parseInt(reader.readLine());

        if (num1 > num2) {
            System.out.println("Число " + num1 + " більше!");
        } else {
            System.out.println("Число " + num2 + " більше!");
        }

    }
}
