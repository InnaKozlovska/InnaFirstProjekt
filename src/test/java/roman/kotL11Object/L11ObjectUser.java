package roman.kotL11Object;

public class L11ObjectUser {
    private String name;
    private int age;

    public L11ObjectUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "My name is " + name + " and I am " + age + " years old";
    }


}
