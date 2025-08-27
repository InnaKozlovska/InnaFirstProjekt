package inna;

import java.util.List;

public class Exception {

    public static void main(String[] args) {


        List<String> listProba = List.of("Kola","Petya");

        try {
            System.out.println("Старт");

            System.out.println(listProba.get(2));
        } catch (RuntimeException exc) {
            System.out.println("У нас помилка!! Ми вийшли за предели ліста. У лісті такого індекса не існує. В листі столько елементів : "+ listProba.size());
//            throw new RuntimeException("У нас помилка!!");
        }
    }

}