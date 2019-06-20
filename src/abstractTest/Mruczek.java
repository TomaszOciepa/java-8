package abstractTest;

public class Mruczek extends Cat {

    String name;

    public Mruczek(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sleept() {
        System.out.println("ZZZzzzZZzzZ");
    }
}
