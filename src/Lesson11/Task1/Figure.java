package Lesson11.Task1;

public class Figure {
    public static void main(String[] args) {
        Interface triangle = new Triangle(2,2,4);
        Interface rectangle = new Rectangle(2, 4);
        Interface square = new Square(3);
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Square perimeter: " + square.getPerimeter());
    }
}
