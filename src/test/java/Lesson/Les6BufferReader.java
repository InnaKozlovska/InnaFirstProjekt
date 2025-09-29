package Lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; //окремі класи

public class Les6BufferReader {
    //два типу потоки- введення input (дані поступають з потоку в нашу програму, ми їх читаємо)
    //виведення output - дані поступають у потік з нашої програми(ми їх пишемо у потік)
    //потік читання по байтах
    //потік читання по символах
    //inputStream потік для читання байтів(byte)
    //Reader потік для читання символів(char)

    public static void main(String[] args) throws IOException {
        //system.in використовується для читання даних з консолі з допомогою клавіатури байти
        //system.out для виведення даних у консоль
        //InputStreamReader потік читає байти та перетворює у символи
        //BufferedReader використовується для буферного читання з консолі

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        InputStreamReader streamReader = new InputStreamReader(System.in);
//        System.out.println(streamReader.read());

//        String s = reader.readLine(); //readLine читає завжди рядки
//        System.out.println(s);

        //введення чисел з консолі

//        String str = reader.readLine();
//        int num = Integer.parseInt(str);
//        System.out.println(num * 2);


        int num5 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());

        System.out.println(sum(num5, num4));




        //введення чисел з клавіатури та знаходження суми
    }
    private static int sum(int number5, int number4){
        int res = number5 + number4;
        return res;


    }






}