package roman.JavaCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class L17HashSet {
    public static void main(String[] args) {
        //! Для роботи з set використовується ітератор.
        //! Відсутній метод get(), тобто відсутній індекс.
        //! При роботі з set використовується не масив, а хеш таблиця.
        //! Дані зберігаються рандомно, не сортуються і не по черзі їх додавання.
        Set<String> set = new HashSet<>();
        set.add("text1");
        set.add("text2");
        set.add("text3");
        set.add("text4");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String s = iterator.next(); //  курсор на iterator.next() далі альт+ентер.
            System.out.println(s);

        }

        // щоб створити цикл форіч треба написати iter.
        for (String s : set) {
            System.out.println(s);
        }
    }
}
