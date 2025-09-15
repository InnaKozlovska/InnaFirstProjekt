package Lesson;

import java.util.LinkedHashSet;
import java.util.Set;

public class Les17LinkHashSet {
    public static void main(String[] args) {
        //елементи зберіг.у тому порядку в якому ми їх добавляємо
        //довго працює, бо викор.лінкед список
        //

        Set<String> set = new LinkedHashSet<>();
        set.add("text1");
        set.add("text2");
        set.add("text3");
        set.add("text4");

        for (String s : set) {
            System.out.println(s);
        }
    }

}
