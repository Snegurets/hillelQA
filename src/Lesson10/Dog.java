package Lesson10;

public class Dog extends Animal{
    private String dogsBreed;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав-Гав");
    }

    @Override
    public void eat() {
        System.out.println("Собака кушает корм");

    }
}
