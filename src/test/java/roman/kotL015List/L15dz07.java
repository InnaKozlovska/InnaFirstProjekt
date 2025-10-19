package roman.kotL015List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L15dz07 {
    // 1. Создай список строк.
    // 2. Считай с клавиатуры 5 строк и добавь в список.
    // 3. Используя цикл, найди самую длинную строку в списке.
    // 4. Выведи найденную строку на экран.
    // 5. Если таких строк несколько, выведи каждую с новой строки.
    public static void main(String[] args) {
        List<String> listOfValues = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть пять інтових чисел!");
        System.out.println("Щоб зупинитись введіть пусту стрічку!");
        while (true) {
            String imput = scanner.nextLine();
            if (imput.isEmpty()) {
                break;
            }
            listOfValues.add(imput);

        }

        System.out.println(listOfValues);
//
//
//                int maxLength = 0;
//            for (int i = 0; i<= listOfValues.size(); i++){
//                if (listOfValues.get(0).length() > maxLength){
//                    maxLength = listOfValues.get(0)
//                }
//            }
//        }
//        System.out.println(listOfValues);
    }
}
