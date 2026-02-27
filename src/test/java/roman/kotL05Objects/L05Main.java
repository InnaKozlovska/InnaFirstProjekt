package roman.kotL05Objects;


/*
локальні змінні = створюються в методах.
глобальні змінні = створюються в класах.


 */
public class L05Main {
    public static void main(String[] args) {
        L05User user = new L05User();
        user.age = 25;
        user.name = "Asus";
        user.passportData = "0000";

        L05User user1 = new L05User();
        user1.age = 30;
        user1.name = "Dell";
        user1.passportData = "1111";

    }
}
