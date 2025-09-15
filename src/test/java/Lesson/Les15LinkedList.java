package Lesson;

import java.util.LinkedList;
import java.util.List;


public class Les15LinkedList {
    public static void main(String[] args) {
        //! LinkedList працює повільніше, бо зберігається на хіпі рандомно!
        //! В кожному індексі зберігається посилання на попередній і наступний елемент.
        //! Швидко записується
        List<Integer> list = new LinkedList<>();
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