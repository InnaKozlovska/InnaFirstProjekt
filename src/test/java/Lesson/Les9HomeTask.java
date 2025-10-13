package Lesson;

import java.awt.*;

public class Les9HomeTask {

    //Створити клас Robot с параметрами: name, age, power
    //Реалізувати метод boolean fight(Robot anotherRobot):
    //реалізувати механізм драки роботів в залежності от силы.
    //Метод має визначити, выиграл ли робот у которого вызвали метод fight (this) бой или нет,
    //т.е. повертати true, якщо выиграли и false - якщо нет. має выполняться умова:
    //якщо robot1.fight(robot2) = true , то robot2.fight(robot1) = false

    /*
1) Створити клас Woman с параметрами: name, age. Подумай, якого типа має бути кожна перемінна.
2) Створити классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, якого типу має бути кожна перемінна.
3) В выполняющем методе створити по одному экземпляру кожного класу і зробити так, щоб власник кожної тварини
була одна і та ж жінка.


//1) Створити клас Woman с параметрами: name, age, husband. Подумай, якого типа має бути кожна перемінна.
2) Створити клас Man с параметрами: name, age, wife. Подумай, якого типу має бути кожна перемінна.
3) В выполняющем методе створити по одному экземпляру кожного класу і зробити так, щоб объекты стали мужем и женой
     */

    // 1
//    public class Robot {
//        private String name;
//        private int age;
//        private int power;
//
//        public Robot(String name, int age, int power) {
//
//            this.name = name;
//            this.age = age;
//            this.power = power;
//        }
//
//        public boolean fight(Robot anotherRobot) {
//            if (this.power > anotherRobot.power) {
//                return true;
//            } else if (this.power < anotherRobot.power) {
//                return false;
//            } else {
//                return this.age < anotherRobot.age;
//            }
//
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public int getPower() {
//            return power;
//        }
//    }
//
//    //2
//    public static class Woman {
//
//        public Man husband;
//        String name; //текст, тому тип String
//        int age; //вік ціле число
//
//
//        public Woman(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//
//    }
//
//    public static class Cat {
//        String name;
//        int age;
//        Woman owner; //власник людина
//
//        public Cat(String name, int age, Woman owner) {
//            this.name = name;
//            this.age = age;
//            this.owner = owner;
//        }
//    }
//
//    public static class Dog {
//        String name;
//        int age;
//        Woman owner;
//
//        public Dog(String name, int age, Woman owner) {
//            this.name = name;
//            this.age = age;
//            this.owner = owner;
//        }
//    }
//        public static class Fish {
//        String name;
//        int age;
//        Woman owner;
//
//        public Fish(String name, int age, Woman owner) {
//            this.name = name;
//            this.age = age;
//            this.owner = owner;
//
//        }
//    }
//
//
//    public static class Animals {
//        public static void main(String[] args) {
//            Woman woman = new Woman("Alla", 30);
//
//            Cat cat = new Cat("Marko", 1, woman);
//            Dog dog = new Dog("Rex", 5, woman);
//            Fish fish = new Fish("Bubu", 3, woman);
//
//
//            System.out.println("Власниця кота: " + cat.owner.name);
//            System.out.println("Власниця собаки: " + dog.owner.name);
//            System.out.println("Власниця рибки: " + fish.owner.name);
//        }
//
//    }

    //3
    public static class Woman2 {

        String name; //текст, тому тип String
        int age;
        Man husband;//чоловік тип Man

        public Woman2(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }

    public static class Man {

        String name;
        int age;
         Woman2 wife;// дружина тип Woman

        public Man(String name, int age) {
            this.name = name;
            this.age = age;

        }

    }

    public static class Gender {
        public static void main(String[] args) {
            Woman2 woman = new Woman2("Alla", 30);
            Man man = new Man("Ralf", 45);


            woman.husband = man;
            man.wife = woman;


            System.out.println(woman.name + " одружена з " + woman.husband.name);
            System.out.println(man.name + " одружений з " + man.wife.name);

        }






    }
}

