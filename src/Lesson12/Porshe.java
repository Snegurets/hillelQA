package Lesson12;

public class Porshe implements Car{
    @Override
    public void drive() {
        System.out.println("Drive speed 120 km/h.");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 4 sec.");
    }
}
