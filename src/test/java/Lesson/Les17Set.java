package Lesson;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Les17Set {
    public static void main(String[] args) {
        // у колекції Set зберіг.тільки унікальні значення
        //викор.ітератор, бо немає методу get, відсутній індекс
        // викор.хешкод об"єкту
        //реаліз.на основі hash таблиці, не масив
        // дані зберіг.рандомно, не у порядку додовання
        // швидко працює
        Set<String> set = new HashSet<>();
        set.add("text1");
        set.add("text2");
        set.add("text3");
        set.add("text4");


        Iterator<String> iterator = set.iterator(); //Alt + Enter нажимаємо і вибираємо Introduce variable
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);

        }
        for (String s : set) {
            System.out.println(s);
        }

    }
}
