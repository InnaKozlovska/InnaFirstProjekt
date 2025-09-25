package Lesson;

public class Les4HomeTask {
    /*
1) Создать метод sum, который должен суммировать 2 числа.
2) Создать метод multy, который должен умножить 2 числа.
3) Создать метод subt, который должен вычесть второе число из первого.
4) Создать метод div, который должен делить 2 числа.
*/
/*
5) Создать метод convert, который должен конвертировать евро в доллары. В метод должен приходить один аргумент (к-во евро). Метод должен возвращать к-во долларов.
6) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
7) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
*/

    public static void main(String[] args) {

        int res1 = sum(100, 200);
        System.out.println(res1);

        int result = multy(50, 3);
        System.out.println(result);

        int result3 = subt(96, 25);
        System.out.println(result3);

        double result4 = div(15.5,6);
        System.out.println(result4);

        print("донт пуш зе хорсес :)");

    }

    public static int sum(int number1, int number2) { //1 сума двох чисел
        int res1 = number1 + number2;
        return res1;
    }


    public static int multy(int a, int b) { //2 множення двох чисел
        return a * b;
    }

    public static int subt(int c, int d) { //3 віднімання
        return c - d;
    }

    public static double div(double f, double d) { //4 ділення
        return f/ d;

    }

    public static void print(String text) { //7 виводить рядок 4 рази в консоль
        for (int i = 0; i < 4; i++) {
            System.out.println(text);
        }
    }
}

