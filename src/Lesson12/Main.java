package Lesson12;

public class Main {
    public static void main(String[] args) {
        CarFactoryMethod carFactoryMethod = new CarFactoryMethod();
        Car carFirst = carFactoryMethod.getCar(RoadType.CITY);
        carFirst.drive();
        carFirst.stop();

        Car carSecond = carFactoryMethod.getCar(RoadType.OFF_ROAD);
        carSecond.stop();
        carSecond.drive();



    }
}
