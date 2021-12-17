package Lesson11.Task1;

public class Square implements Interface{
    float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float getPerimeter() {
        return side * 4;
    }
}
