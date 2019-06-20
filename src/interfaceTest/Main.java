package interfaceTest;

public class Main {

    public static void main(String[] args) {
        Subaru subaru = new Subaru("Subaru", "Niebieski", 2.5f, "benzyna");

        System.out.println(subaru.toString());
        subaru.numberWheels();

    }
}
