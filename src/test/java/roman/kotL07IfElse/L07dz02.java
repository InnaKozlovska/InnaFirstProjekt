package roman.kotL07IfElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L07dz02 {
    /*
        Ввести с клавиатуры три числа, вывести на экран минимальное из них.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть перше число для порівняння");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Введіть друге число для порівняння");
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println("Введіть третє число для порівняння");
        int num3 = Integer.parseInt(reader.readLine());

        if (num1 > num2 && num1 > num3) {
            System.out.println("Число " + num1 + " найбільше!");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Число " + num2 + " найбільше!");
        } else {
            System.out.println("Число " + num3 + " найбільше!");
        }
    }
}
