package interfaceTest;

public class Subaru implements Car {


    String mark;
    String color;
    Float engineCm3;
    String typeOfDrive;

    public Subaru(String mark, String color, Float engineCm3,  String typeOfDrive) {
        this.mark = mark;
        this.color = color;
        this.engineCm3 = engineCm3;
        this.typeOfDrive = typeOfDrive;
    }

    @Override
    public void mark() {
        System.out.println("Marka:  "+mark);
    }

    @Override
    public void color() {
        System.out.println("Kolor: "+ color);
    }

    @Override
    public void engineCm3() {
        System.out.println("Pojemność silnika: "+engineCm3);
    }


    @Override
    public void typeOfDrive() {
        System.out.println("Rodzaj napędu: "+typeOfDrive);
    }

    @Override
    public String toString() {
        return "Subaru{" +
                "mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", engineCm3=" + engineCm3 +
                ", engineCm3=" + engineCm3 +
                ", typeOfDrive='" + typeOfDrive + '\'' +
                '}';
    }
}
