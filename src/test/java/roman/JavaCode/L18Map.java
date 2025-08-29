package roman.JavaCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class L18Map {
    public static void main(String[] args) {
        //! Зберігає інформацію у вигляді ключ-значень, тобто у вигляді пар.
        //! Зберігає в собі "ключ" і "значення".
        //! map.put("text1", 5); перша части на ключ, він унікальний, тобто не може повторюватись.
        //! Якщо ключі будуть співпадати, то "значення" будуть перезаписуватись.
        //! Дублікатів не може бути!
        //! Щоб використати "ітератор" потрібно використати метод entrySet().
        //! Базовий розмір HashMap = 16. При заповненні на 75% розмір збільшується вдвічі.
        //!

        Map<String, Integer> map = new HashMap<>();
        map.put("text1", 5);
        map.put("text2", 7);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry);

        }
    }
}
