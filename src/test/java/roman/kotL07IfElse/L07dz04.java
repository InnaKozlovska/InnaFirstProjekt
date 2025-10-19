package roman.kotL07IfElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L07dz04 {
    /*
    Реализовать метод compare(int a).
    Метод должен выводить строку на экран "Число меньше 5",
    если параметр метода меньше 5 - и, выводить строку "Число больше 5", если параметр
    метода больше 5 - и, и выводить строку "Число равно 5", если параметр метода равен 5 - и.
   */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        compare(number);

    }

    public static void compare(int number) {
        int mainNumber = 5;
        if (number < mainNumber) {
            System.out.println("Число " + number + " менше " + mainNumber);
        } else if (number > mainNumber) {
            System.out.println("Число " + number + " быльше " + mainNumber);
        } else {
            System.out.println("Число " + number + " рівне " + mainNumber);
        }

    }
}
