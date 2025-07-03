package arhiveOldClasses;

import java.util.ArrayList;
import java.util.List;

public class ForTaskForeach {

    public static void main(String[] args) { // метод for each
        List<ForBankCard> bankcards = new ArrayList<>();
        bankcards.add(new ForBankCard("154", 2029, 123, "Kozich"));
        bankcards.add(new ForBankCard("155", 2028, 130, "Tkachuk"));

        for (ForBankCard b : bankcards) {
            System.out.println("Номер картки - " + b.nummer + " / Дата - " + b.data + " / Код - " + b.cvc + " / Власник - " + b.vlasnuk);
        }
    }
}




