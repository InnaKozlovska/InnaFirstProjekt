package roman.romanitkot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.compare;

public class L07DZ {
    /*
    Ввести с клавиатуры два числа, вывести на экран максимальное из них.
    */
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введіть перше число для порівняння");
//        int num1 = Integer.parseInt(reader.readLine());
//        System.out.println("Введіть друге число для порівняння");
//        int num2 = Integer.parseInt(reader.readLine());
//
//        if (num1 > num2) {
//            System.out.println("Число " + num1 + " більше!");
//        } else {
//            System.out.println("Число " + num2 + " більше!");
//        }
//
//    }

    /*
        Ввести с клавиатуры три числа, вывести на экран минимальное из них.
    */
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введіть перше число для порівняння");
//        int num1 = Integer.parseInt(reader.readLine());
//        System.out.println("Введіть друге число для порівняння");
//        int num2 = Integer.parseInt(reader.readLine());
//        System.out.println("Введіть третє число для порівняння");
//        int num3 = Integer.parseInt(reader.readLine());
//
//        if (num1 > num2 && num1 > num3) {
//            System.out.println("Число " + num1 + " найбільше!");
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println("Число " + num2 + " найбільше!");
//        } else {
//            System.out.println("Число " + num3 + " найбільше!");
//        }
//    }

    /*
    Ввести с клавиатуры три числа, вывести на экран среднее из них.
    */
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введіть перше число для порівняння");
//        int num1 = Integer.parseInt(reader.readLine());
//        System.out.println("Введіть друге число для порівняння");
//        int num2 = Integer.parseInt(reader.readLine());
//        System.out.println("Введіть третє число для порівняння");
//        int num3 = Integer.parseInt(reader.readLine());
//
//        if ((num1 > num2 && num1 < num3) || (num1 < num2 && num1 > num3)) {
//            System.out.println("Число " + num1 + " середнє!");
//        } else if ((num2 > num1 && num2 < num3) || (num2 < num1 && num2 > num3)) {
//            System.out.println("Число " + num2 + " середнє!");
//        } else {
//            System.out.println("Число " + num3 + " середнє!");
//        }
//    }

    //!
    /*
     Реализовать метод compare(int a).
     Метод должен выводить строку на экран "Число меньше 5",
     если параметр метода меньше 5 - и, выводить строку "Число больше 5", если параметр
     метода больше 5 - и, и выводить строку "Число равно 5", если параметр метода равен 5 - и.
    */
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int number = Integer.parseInt(reader.readLine());
//
//
//    }
//
//    public static void compare (int number){
//        int mainNumber = 5;
//
//    }



    /*
     Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
     Если число отрицательное, то увеличить его на 10. Вывести результат на экран.
    */
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("введіть число з клавіатури");
//        int number = Integer.parseInt(reader.readLine());
//
//        if (number > 0) {
//            System.out.println("число додатнє, збільшуємо його вдвічі");
//            System.out.println(number * 2);
//        } else if (number < 0) {
//            System.out.println("число відємне, збільшуємо на 10");
//            System.out.println(number + 10);
//        } else {
//            System.out.println("дій не виконано, введено число 0");
//        }
//    }

    /*
     Реализовать метод checkInterval.
     Метод должен проверять попало ли целое число в интервал от 20 до 50 и сообщить
     результат на экран в следующем виде: "Число а не содержится в интервале." или
     "Число а содержится в интервале.", где а - аргумент метода.
    */
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int number = Integer.parseInt(reader.readLine());
//        checkInterval(number);
//    }
//
//    public static void checkInterval(int number) {
//        if (number >= 20 && number <= 50) {
//            System.out.println("число входить в інтервал від 20 до 50");
//        } else {
//            System.out.println("число НЕ входить в інтервал від 20 до 50");
//        }
//    }

    /*
     Реализовать метод closeToFive.
     Метод должен выводить на экран ближайшее к 5 из двух чисел, записанных в
     аргументах метода. Например, среди чисел 3 и 6 ближайшее к пяти 6.
     Если оба числа на равной длине к 5, то вывести на экран любое из них.
    */
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int number1 = Integer.parseInt(reader.readLine());
//        int number2 = Integer.parseInt(reader.readLine());
//        closeToFive(number1, number2);
//    }
//
//    public static void closeToFive(int number1, int number2) {
//        int mainNubmer = 5;
//        int diffNumber1 = Math.abs(mainNubmer - number1);
//        int diffNumber2 = Math.abs(mainNubmer - number2);
//
//        if (diffNumber1 < diffNumber2) {
//            System.out.println("Ближче до " + mainNubmer + " число " + number1);
//        } else if (diffNumber1 > diffNumber2) {
//            System.out.println("Ближче до " + mainNubmer + " число " + number2);
//        } else {
//            System.out.println("числа рівновіддалені ");
//        }
//    }


}
