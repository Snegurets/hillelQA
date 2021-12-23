package Lesson11.Task3;

public class Drum implements Instrument{
    int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан такого размера: " + size);
    }
}
