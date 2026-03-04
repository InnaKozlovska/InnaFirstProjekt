package roman.kotL08ForWhileDowhile;

public class L08Break {
    public static void main(String[] args) {
        System.out.println("BREAK");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.println("i=7 thats why break");
                break;
            }
            System.out.println("Iteration number " + i);
        }

    }
}
