package interfaceTest;

public class Main {

    public static void main(String[] args) {
     Car subaru = new Subaru("Subaru", "Niebieski", 2.5f, "benzyna");

        System.out.println(subaru.toString());
        subaru.numberWheels();
        subaru.goldWheels();

    }
}
