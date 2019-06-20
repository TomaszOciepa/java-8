package abstractTest;


public abstract class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Eat meal");
    }

    @Override
    public void noise() {
        System.out.println("hau hau hau");
    }

}
