package roman.kotL06BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L06dz02 {
    /*
    Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» будет получать «число1» через «число2» лет.
    Пример:
    Alex будет получать 4000 через 5 лет.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть імя:");
        String name = reader.readLine();
        System.out.println("Введіть зарплату:");
        String payment = reader.readLine();
        System.out.println("Введіть кількість років:");
        String time = reader.readLine();
        System.out.println(name + " буде отримувати зарплату $" + payment + " через " + time + " років!");
    }


}
