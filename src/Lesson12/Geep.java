package Lesson12;

public class Geep implements Car{
    @Override
    public void drive() {
        System.out.println("Drive speed 60 km/h.");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 7 sec.");

    }
}
