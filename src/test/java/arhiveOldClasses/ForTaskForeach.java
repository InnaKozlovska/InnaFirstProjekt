package For141516;

import java.util.ArrayList;
import java.util.List;

public class TaskForeach {

    public static void main(String[] args) { // метод for each
        List<BankCard> bankCardArrayList = new ArrayList<>();
        BankCard kozichBankCard = new BankCard("154", 2029, 123, "Kozich");
        bankCardArrayList.add(kozichBankCard);

        bankCardArrayList.add(new BankCard("155", 2028, 130, "Tkachuk"));
        //System.out.println(bankCardArrayList.get(0).toString());



      for (BankCard b : bankCardArrayList) {
           // System.out.println("Номер картки - " + b.nummer + " / Дата - " + b.data + " / Код - " + b.cvc + " / Власник - " + b.vlasnuk);

       print(b.toString());
        }
    }
    public static void print (String str) {

        System.out.println(str);
    }
}




