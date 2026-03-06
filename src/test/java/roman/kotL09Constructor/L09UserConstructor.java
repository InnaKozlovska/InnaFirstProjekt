package roman.kotL09Constructor;

public class L09UserConstructor {
    public int age;
    public String name;
    public String passportData;

    public L09UserConstructor(int age, String name, String passportData) {
        this.age = age;
        this.name = name;
        this.passportData = passportData;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
