package roman.exception;

public class exception001 {
    //! Під час виконання коду Java можуть виникнути різні помилки.
    //! Інструкція try дозволяє визначити блок коду, який потрібно перевірити на помилки під час його виконання.
    //! Інструкція catch дозволяє визначити блок коду, який буде виконано, якщо в блоці try станеться помилка.

//    public static void main(String[] args) {
//        try {
//            int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[10]);
//        } catch (Exception e) {
//            System.out.println("Щось пішло не так.");
//        }
//    }

    //! Інструкція finally дозволяє виконувати код після try...catch, незалежно від результату.

//    public static void main(String[] args) {
//        try {
//            int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[10]);
//        } catch (Exception e) {
//            System.out.println("Щось пішло не так.");
//        } finally {
//            System.out.println(" 'try catch' завершено.");
//        }
//    }

    //! Інструкція throw дозволяє створити спеціальну помилку.
    //! Інструкція throw використовується разом із типом винятку. У Java доступно багато типів винятків:
    //! ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException тощо.

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Доступ заборонено - Вам повинно бути не менше 18 років.");
        }
        else {
            System.out.println("Доступ надано - ви достатньо дорослі!");
        }
    }

    public static void main(String[] args) {
        checkAge(15); // Встановіть вік 15 (що менше ніж 18...)
    }

}
