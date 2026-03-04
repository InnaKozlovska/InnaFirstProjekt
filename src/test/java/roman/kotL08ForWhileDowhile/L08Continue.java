package roman.kotL08ForWhileDowhile;

public class L08Continue {
    public static void main(String[] args) {
        System.out.println("CONTINUE");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.println("i=7 thats why nothing to print");
                continue;

            }
            System.out.println("Iteration number " + i);
        }
    }
}
