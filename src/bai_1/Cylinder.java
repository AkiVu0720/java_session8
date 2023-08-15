package bai_1;

public class Cylinder extends Circle{
private float height;
private float capacity;
//get set
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }
//3
    public Cylinder() {
    }

    public Cylinder(float height) {
        this.height = height;

    }

    public Cylinder(String color, float radius, float height) {
        super(color, radius);
        this.height = height;

    }

    //
public void acreCylinder (){
        this.capacity = (float) Math.pow(this.getRadius(),2)*this.height;
    System.out.printf("The tich hinh tru la: %.2f\n",this.capacity);

}

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", capacity=" + capacity +
                '}';
    }

}
