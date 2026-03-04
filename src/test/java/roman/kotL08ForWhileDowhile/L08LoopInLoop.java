package roman.kotL08ForWhileDowhile;

public class L08LoopInLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("Iteration number (j) " + j);
            }
            System.out.println("(i) " + i);
        }
    }
}
