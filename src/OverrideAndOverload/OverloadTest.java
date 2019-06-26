package OverrideAndOverload;

public class OverloadTest {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speciesOfAnimal();
        animal.speciesOfAnimal("Cat");
        animal.speciesOfAnimal("Dog", 10);
    }
}
