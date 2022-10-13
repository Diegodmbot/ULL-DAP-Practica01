package practica01;

import practica01.Shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(3, 4, 5);
        shapes[1] = new Circle(5);
        shapes[2] = new Rectangle(3, 4);
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }
    }
}
