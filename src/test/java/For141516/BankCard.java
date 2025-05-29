package For141516;

public class BankCard {

    public String nummer;
    public Integer data;
    public Integer cvc;
    public String vlasnuk;


    public BankCard(String nummer, Integer data, Integer cvc,String vlasnuk) { // параметри
        this.nummer = nummer; // конструктор
        this.data = data;
        this.cvc = cvc;
        this.vlasnuk = vlasnuk;
    }
}
