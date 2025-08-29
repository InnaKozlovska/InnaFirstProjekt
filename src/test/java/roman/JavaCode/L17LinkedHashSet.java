package roman.JavaCode;

import java.util.LinkedHashSet;
import java.util.Set;

public class L17LinkedHashSet {
    public static void main(String[] args) {
        //! Данні зберігаються по черзі їх додавання.
        //! Працює набагато довше чим хеш сет, через те що присутній лінкед список.
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
