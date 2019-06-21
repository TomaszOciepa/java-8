package com.exercises;

public class CarTest {


    public static void main(String[] args) {
        Mercedes merc = new Mercedes();
        merc.mark();
        merc.color();
        merc.typeOfDrive();
        merc.numberDors();

        System.out.println();
        System.out.println("===========");
        System.out.println();

        BMW bmw = new BMW();
        bmw.mark();
        bmw.color();
        bmw.typeOfDrive();
        bmw.numberDors();
    }
}

class Mercedes implements Car {

    @Override
    public void numberDors() {
        System.out.println("I'm cupe. I have 3 dors!");
    }

    @Override
    public void mark() {
        System.out.println("Mercedes");
    }

    @Override
    public void color() {
        System.out.println("Black");
    }

    @Override
    public void typeOfDrive() {
        System.out.println("I'm petrol car");
    }
}


class BMW implements Car {

    @Override
    public void mark() {
        System.out.println("BMW");
    }

    @Override
    public void color() {
        System.out.println("White");
    }

    @Override
    public void typeOfDrive() {
        System.out.println("I'm oil car");
    }
}
