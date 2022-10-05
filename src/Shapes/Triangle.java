package Shapes;

public class Triangle implements Shape{
    private int side1;
    private int side2;
    private int side3;
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public void draw() {
        System.out.println("Shapes.Triangle)");
    }
    // Heron's formula
    public double getArea() {
        double s = getSemiPerimeter();
        return  Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    private int getSemiPerimeter() {
        return (side1 + side2 + side3) / 2;
    }
}
