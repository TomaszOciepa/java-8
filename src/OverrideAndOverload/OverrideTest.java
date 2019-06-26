package OverrideAndOverload;

public class OverrideTest {

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.startEngine();
        bmw.fuelType();

        Car.smoething();

        System.out.println(Car.mark);
    }
}
