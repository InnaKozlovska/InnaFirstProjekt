package roman.romanjavainfo;

public class CastingInfo {
    public static void main(String[] args) {
        //! widening casting (розширення, автоматично) - перетворення меншого типу на тип більшого розміру
        //! byte -> short -> char -> int -> long -> float -> double
        //! Усі переходи "вгору" відбуваються автоматично (без касту).
        //! Виключення: short → char не працює автоматично, бо різні типи.
        byte b1 = 10;
        short s1 = b1;           // byte -> short
        int i1 = s1;             // short -> int
        long l1 = i1;            // int -> long
        float f1 = l1;           // long -> float
        double d1 = f1;          // float -> double

        char c1 = 'A';          // символ 'A' = 65
        int iFromChar1 = c1;     // char -> int
        long lFromChar1 = c1;    // char -> long
        float fFromChar1 = c1;   // char -> float
        double dFromChar1 = c1;  // char -> double

        System.out.println("byte -> short: " + s1);
        System.out.println("short -> int: " + i1);
        System.out.println("int -> long: " + l1);
        System.out.println("long -> float: " + f1);
        System.out.println("float -> double: " + d1);

        System.out.println("char -> int: " + iFromChar1);
        System.out.println("char -> long: " + lFromChar1);
        System.out.println("char -> float: " + fFromChar1);
        System.out.println("char -> double: " + dFromChar1);

        //! Narrowing Casting (звуження, вручну) - перетворення більшого типу в тип меншого розміру.
        //! double -> float -> long -> int -> char -> short -> byte
        //! Завжди потрібен явний каст (type).
        //! Може бути втрата даних (обрізання десяткових, переповнення, зміна знаку).
        //! double → float  Втрачається точність (float має 7 знаків після коми, double — 15).
        //! float → long    Відрізається дробова частина.
        //! long → int      Якщо число більше за int діапазон → переповнення.
        //! int → char      Береться Unicode-символ із цим кодом (у прикладі 12345 = '〹').
        //! char → short    Якщо символ > 32767 → переповнення.
        //! short → byte    Якщо значення > 127 або < -128 → переповнення.

        double d2 = 12345.6789;
        float f2 = (float) d2;    // double -> float
        long l2 = (long) f2;      // float -> long
        int i2 = (int) l2;        // long -> int
        char c2 = (char) i2;      // int -> char
        short s2 = (short) c2;    // char -> short
        byte b2 = (byte) s2;      // short -> byte

        System.out.println("double: " + d2);
        System.out.println("float (double->float): " + f2);
        System.out.println("long (float->long): " + l2);
        System.out.println("int (long->int): " + i2);
        System.out.println("char (int->char): " + (int) c2 + " '" + c2 + "'");
        System.out.println("short (char->short): " + s2);
        System.out.println("byte (short->byte): " + b2);

    }
}
