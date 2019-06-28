package staticTest;

public class Human {

    String name;
    int age;
    static String nacionality;

    public static String getNacionality() {
        return nacionality;
    }


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void showNationality(){
        System.out.println(nacionality);

    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", nacionality=" + nacionality +
                '}';
    }
}
