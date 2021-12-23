package Lesson11.Task1;

public class Triangle implements Interface{
    private float a;
    private float b;
    private float c;


    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public float getPerimeter() {
        return a + b + c;
    }
}
