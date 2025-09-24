package Lesson;

public class Les4Metody {
    public static void main(String[] args) {
        //методи потрібні, щоб мінімізувати повторюваність коду
        //покращити читання коду
        //модифікатори доступу:public (метод або клас вико.з будь-якої точки програми), private, default (замовчу.)
        // protected
        // метод void нічого не повертає

        System.out.println("text1");


        int res = sum(20, 40);//автомат.записуються в змінну num3 та num4
        System.out.println(res); //1 метод

        System.out.println(metod("хепі"));//2 метод повернув нам текст і додав енд

        printTwoTimes("Hello"); //3 метод

    }

    // 1 метод знаходить суму двох чисел
    public static int sum(int number3, int number4) {
        int res = number3 + number4; //Перемінна int res завжди має збігатися з типом і повертає значення(int)
        return res;

    }

    //2 метод повертає рядок
    public static String metod (String str){
        String res1 = str + "end";
        return res1;

    }
    //3 метод виводить текст два рази
    private static void printTwoTimes (String str){

        System.out.println(str);
        System.out.println(str);
    }




}
