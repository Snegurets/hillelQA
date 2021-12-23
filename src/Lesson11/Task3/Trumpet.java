package Lesson11.Task3;

public class Trumpet implements Instrument{
    int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба такого диаметра: " + diameter);
    }
}
