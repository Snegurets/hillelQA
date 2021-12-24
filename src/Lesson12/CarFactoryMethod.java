package Lesson12;

public class CarFactoryMethod {
    public Car getCar(RoadType roadType){
        Car car = null;
        switch (roadType){
            case CITY:
                car = new Porshe();
                break;
            case OFF_ROAD:
                car = new Geep();
                break;
        }
        return car;
    }
}
