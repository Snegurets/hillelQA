package Lesson10;

public class Cat extends Animal{
    private String catsBreed;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public void eat() {
        System.out.println("Кошка кушает рыбу");

    }
}
