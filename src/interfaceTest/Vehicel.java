package interfaceTest;

public interface Vehicel {

    default void numberWheels(){
        System.out.println("Ilość kół: 4");
    }

    void typeOfDrive();

}
