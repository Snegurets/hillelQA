package Lesson11.Task3;

public class Guitar implements Instrument {
    int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с таким колличество струн: " + numberOfStrings);

    }
}
