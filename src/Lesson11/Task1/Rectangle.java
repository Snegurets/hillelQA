package Lesson11.Task1;

public class Rectangle implements Interface {
    private float widht;
    private float high;

    public Rectangle(float widht, float high) {
        this.widht = widht;
        this.high = high;

    }

    @Override
    public float getPerimeter() {
        return widht * 2 + high * 2;
    }
}
