package roman.kotL09Constructor;


public class L09userMain {
    public static void main(String[] args) {
        L09UserConstructor user = new L09UserConstructor(30, "Alex","as123456");
        System.out.println(user.getName());

        user.setName("Axel");
        System.out.println(user.getName());

    }
}
