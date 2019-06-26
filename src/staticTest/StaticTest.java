package staticTest;

public class StaticTest {
    public static void main(String[] args) {

        Human.nacionality = "Poland";
        Human tom = new Human("Tom", 29);
        Human klaudia = new Human("Klaudia", 24);

        System.out.println(tom.toString());
        System.out.println(klaudia.toString());

        System.out.println("Change nationality");
        Human.nacionality = "Spain";
        System.out.println(tom.toString());
        System.out.println(klaudia.toString());

        Human.showNationality();
        Human.nacionality = "Afganistan";
        Human.showNationality();
        System.out.println(klaudia.toString());
        System.out.println(tom.toString());
    }
}
