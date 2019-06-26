package OverrideAndOverload;

public class Car extends Vehicel {

    static String mark = "Mercedes";

    public void startEngine(){
        System.out.println("I'm BMW car... HA ha ha ");
    }

    public void fuelType(){
        System.out.println("benzin");
        super.fuelType();
    }

    public static void smoething(){
        System.out.println("I'm static method ");
    }
}
