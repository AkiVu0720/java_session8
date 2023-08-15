package bai_1;

public class Process {


    public static void main(String[] args) {
        Circle circle = new Circle("back",2f);
        Cylinder cylinder = new Cylinder("Red",3,5);
        circle.acreageCircle();
        System.out.println( circle.toString());
        System.out.println("***********");
        cylinder.acreCylinder();
        System.out.printf(cylinder.toString());
    }
}
