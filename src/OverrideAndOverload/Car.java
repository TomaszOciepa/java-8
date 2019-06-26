package OverrideAndOverload;

public class Car extends Vehicel {

    public void startEngine(){
        System.out.println("I'm BMW car... HA ha ha ");
    }

    public void fuelType(){
        System.out.println("benzin");
        super.fuelType();
    }
}
