package roman.kotL02TypesData;

/*
примітивні
byte = 8 bit
short = 16 bit
char = 16 bit
int = 32 bit
long = 64 bit

посилальні
String = "hellow world!"


 */
public class L02TypesData {
    public static void main(String[] args) {
        byte b = -128;
        short s = -32768;
        char c = 'a';
        int i = 2147483647;
        long l = -2147483648L;
        boolean bool = true;
        float f = 3.14f;
        double d = 3.14;

        System.out.println("вивід інтового значення");
        System.out.println(i);

        System.out.println();
        System.out.println("перезапис старого інтового значення на нове значення");
        i = 99;
        System.out.println(i);

        System.out.println();
        System.out.println("парсінг");
        String str = "26";
        System.out.println(str + 2);
        int num = Integer.parseInt(str);
        System.out.println(num );

    }
}
