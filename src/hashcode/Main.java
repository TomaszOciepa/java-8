package hashcode;

public class Main {


    public static void main(String[] args) {
        Human man = new Human("Tomek", "Polish", 29);
        Human man1 = new Human("Tomek", "Polish", 29);


        System.out.println("equals man.equals(man1) "+ man.equals(man1));

        System.out.println("man hashcode: "+man.hashCode());
        System.out.println("man1 hashcode: "+man1.hashCode());

        System.out.println(man == man1);


    }
}
