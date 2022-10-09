package Shapes;

public class Circle extends Shape {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Circle");
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
