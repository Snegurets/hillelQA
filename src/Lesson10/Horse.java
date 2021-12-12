package Lesson10;

public class Horse extends Animal {
    private String horseBreed;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го");
    }

    @Override
    public void eat() {
        System.out.println("Лошади кушают сено");
    }
}
