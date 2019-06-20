package abstractTest;

public class Husky extends Dog {

    String name;

    public Husky(String name) {
        this.name = name;
    }

    @Override
    public void sleept() {
        System.out.println("zzzzzzZZZ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
