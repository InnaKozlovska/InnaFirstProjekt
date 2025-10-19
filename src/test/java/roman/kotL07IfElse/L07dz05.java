package roman.kotL07IfElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L07dz05 {
    /*
     Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
     Если число отрицательное, то увеличить его на 10. Вывести результат на экран.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введіть число з клавіатури");
        int number = Integer.parseInt(reader.readLine());

        if (number > 0) {
            System.out.println("число додатнє, збільшуємо його вдвічі : " + number * 2);
        } else if (number < 0) {
            System.out.println("число відємне, збільшуємо на 10 : " + number + 10);
        } else {
            System.out.println("дій не виконано, введено число 0");
        }
    }
}
