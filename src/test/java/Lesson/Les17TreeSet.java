package Lesson;

import java.util.Set;
import java.util.TreeSet;

public class Les17TreeSet {
    public static void main(String[] args) {
        //збер.елем.у відсортованому порядку, якщо визнач.компаратор
        //для стрінга сортується в алфав.порядку
        //

        Set<String> set = new TreeSet<>();
        set.add("text1");
        set.add("text2");
        set.add("text3");
        set.add("text4");


        for (String s : set) {
            System.out.println(s);
        }

    }

}
