package roman.JavaCode;

import java.util.ArrayList;
import java.util.List;

public class L15ArrayList {
    public static void main(String[] args) {
        //! ArrayList працює швидше чим LinkedList.
        //! Базова кількість індексів 10.
        //! При автоматичному розширенні кількість індексів змінюється ("стара кількість" * 3) / 2 + 1.
        List<Integer> list = new ArrayList<>();
        list.add(5);    // 0 індекс
        list.add(7);    // 1 індекс
        list.add(1, 9); // замінити 1 індекс на цей елемент, а старе значення перемістити на 3 індекс
        list.set(1, 2); // перезаписати 1 індекс
        System.out.println("нульовий елемент = " + list.get(0));
        System.out.println("кількість елементів = " + list.size());

        System.out.println("виводжу всі елементи: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
