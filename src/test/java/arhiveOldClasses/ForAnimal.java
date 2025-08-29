package arhiveOldClasses;

import java.util.ArrayList;
import java.util.List;

public class ForAnimal {


    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();      //
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();

        String[] arr1 = {"Oskar"}; //
        String[] arr2 = {"cat"};
        Integer[] arr3 = {1};        //
        String[] arr4 = {"fish"};


        for (String item : arr1) {    //
            list1.add(item);          //
        }

        for (String item : arr2) {
            list2.add(item);
        }

        for (Integer item : arr3) {
            list3.add(item);
        }

        for (String item : arr4) {
            list4.add(item);
        }

        System.out.println("Kluchka: " + list1);     //
        System.out.println("Vud: " + list2);
        System.out.println("Age: " + list3);
        System.out.println("Food: " + list4);


    }
    }
