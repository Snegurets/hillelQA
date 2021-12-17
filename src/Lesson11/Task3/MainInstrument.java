package Lesson11.Task3;

public class MainInstrument {
    public static void main(String[] args) {
        Instrument guitar = new Guitar(7);
        Instrument drum = new Drum(5);
        Instrument trumpet = new Trumpet(11);
        Instrument[] instruments = {guitar, drum, trumpet};

        for (Instrument instrument : instruments){
            instrument.play();
        }
    }
}
