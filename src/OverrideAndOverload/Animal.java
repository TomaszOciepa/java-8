package OverrideAndOverload;

public class Animal {

    public void speciesOfAnimal(){
        System.out.println("animal");
    }

    public void speciesOfAnimal(String type){
        System.out.println("I'm "+type);
    }

    public void speciesOfAnimal(String type, int age){
        System.out.println("I'm "+type+". I have "+age +" age");
    }

}
