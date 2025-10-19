package roman.kotL07IfElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L07dz06 {
     /*
     Реализовать метод checkInterval.
     Метод должен проверять попало ли целое число в интервал от 20 до 50 и сообщить
     результат на экран в следующем виде: "Число а не содержится в интервале." или
     "Число а содержится в интервале.", где а - аргумент метода.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        checkInterval(number);
    }

    public static void checkInterval(int number) {
        if (number >= 20 && number <= 50) {
            System.out.println("число входить в інтервал від 20 до 50");
        } else {
            System.out.println("число НЕ входить в інтервал від 20 до 50");
        }
    }
}
