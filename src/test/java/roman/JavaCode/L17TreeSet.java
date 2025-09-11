package roman.JavaCode;

import java.util.Set;
import java.util.TreeSet;

public class L17TreeSet {
    public static void main(String[] args) {
        //! 2 по швидкості
        //! Автоматичне сортування який реалізований через спеціальний обєкт "компаратор".
        //! Компаратор відсутній для кастомних обєктів. Для них потрібно створювати компаратор.
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
