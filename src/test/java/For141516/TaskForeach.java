package For141516;

import java.util.ArrayList;
import java.util.List;

public class TaskForeach {

    public static void main(String[] args) { // метод for each
        List<BankCard> bankcards = new ArrayList<>();
        bankcards.add(new BankCard("154", 2029, 123, "Kozich"));
        bankcards.add(new BankCard("155", 2028, 130, "Tkachuk"));

        for (BankCard b : bankcards) {
            System.out.println("Номер картки - " + b.nummer + " / Дата - " + b.data + " / Код - " + b.cvc + " / Власник - " + b.vlasnuk);
        }
    }
}




