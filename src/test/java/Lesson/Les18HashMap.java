package Lesson;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Les18HashMap {

    public static void main(String[] args) {
        // map не походить від Collection
        // зберігає ключ та значення у вигляді пари
        //ключі унікальні, значення можуть бути однакові
        // якщо ключі співпадають, то значення перезаписуються
        // hashMap ст-ра основана на корзинах, це масив з нодами
        //розмір має 16 комірок, при заповненні на 75% розмір збільшується вдвічі.

        Map<String, Integer> map = new HashMap<>();
        map.put("text1", 5); // text 1 це ключ який унікальний і не повторюється
        map.put("text2", 7);

        for (Map.Entry<String, Integer> entry : map.entrySet()) { //entry це вкладений інтерфейс у map
            System.out.println(entry);
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator(); //визивається ітератор з доп.методу
        //entrySet
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry);

        }

    }
}
