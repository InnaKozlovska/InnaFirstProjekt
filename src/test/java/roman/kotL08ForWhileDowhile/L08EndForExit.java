package roman.kotL08ForWhileDowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L08EndForExit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("PRINT 'end' FOR EXIT!");
        String str = reader.readLine();
        while (!str.equals("end")) {
            System.out.println("You printed: " + str);
            str = reader.readLine();

        }

    }
}
