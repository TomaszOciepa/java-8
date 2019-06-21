package com.exercises;

public interface Car {

    default void numberDors(){
        System.out.println("Car have 4 dors");
    }

    void mark();
    void color();
    void typeOfDrive();
}
