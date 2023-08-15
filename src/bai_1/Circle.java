package bai_1;

public class Circle {
    static final float PI = 3.14f;
    //1 Attribute
    private String color;
    private float radius;
    private float acrea;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
//3
    public Circle() {
    }



    public Circle(String color, float radius) {
        this.color = color;
        this.radius = radius;

    }
    public void acreageCircle(){
        this.acrea = this.radius*2 * PI;
        System.out.printf(" Dien tich hinh tron: %.2f\n", this.acrea);
    }

    // ghi de

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                ", acrea=" + acrea +
                '}';
    }

}
