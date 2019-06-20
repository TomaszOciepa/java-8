package abstractTest;

public abstract class Cat  extends Animal{
    @Override
    public void noise() {
        System.out.println("Mrauuu Maruuu");
    }

    @Override
    public void eat() {
        System.out.println("Drink milk");
    }

}
