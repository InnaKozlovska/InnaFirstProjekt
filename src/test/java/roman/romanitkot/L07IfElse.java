package roman.romanitkot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L07IfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вкажіть ваш вік: ");
        int age = Integer.parseInt(reader.readLine());

        if (age >= 18) {
            System.out.println("Контернт дозволений!");
        } else {
            System.out.println("Контент заборонений!");
        }
    }
}
