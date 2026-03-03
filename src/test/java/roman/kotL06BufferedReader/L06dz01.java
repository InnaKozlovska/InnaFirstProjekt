package roman.kotL06BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L06dz01 {
    /*
Ввести с клавиатуры число n.
Вывести на экран надпись «Я зарабатываю $n в час».
Пример:
Я буду зарабатывать $50 в час
*/

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        System.out.println("Я буду заробляти $" + input + " в місяць!");

    }
}
