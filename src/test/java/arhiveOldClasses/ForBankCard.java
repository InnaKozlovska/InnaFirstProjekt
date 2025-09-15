package arhiveOldClasses;

public class ForBankCard {

    public String nummer;
    public Integer data;
    public Integer cvc;
    public String vlasnuk;


    public ForBankCard(String nummer, Integer data, Integer cvc, String vlasnuk) { // параметри
        this.nummer = nummer; // конструктор
        this.data = data;
        this.cvc = cvc;
        this.vlasnuk = vlasnuk;
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "nummer='" + nummer + '\'' +
                ", aaaaa=" + data +
                ", cvc=" + cvc +
                ", vlasnuk='" + vlasnuk + '\'' +
                '}';
    }
}
