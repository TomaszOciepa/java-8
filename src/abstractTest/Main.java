package abstractTest;

public class Main {

    public static void main(String[] args) {

        Husky fafik = new Husky("Fafik");
        System.out.println(fafik.getName());
        fafik.noise();
        fafik.eat();
        fafik.sleept();

        Mruczek pujek = new Mruczek("Pujek");
        System.out.println(pujek.getName());
        pujek.noise();
        pujek.eat();
        pujek.sleept();
    }
}
