package Lesson10;


public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood(){
        return food;
    }
    public String getLocation(){
        return location;
    }
    public void setFood(String food){
        this.food = food;
    }
    public void setLocation(String location){
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Животное издает звуки.");
    }

    public void eat() {
        System.out.println("Животное кушает.");
    }

    public void sleep(){
        System.out.println("Животное спит.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("food", "location");
        animal.makeNoise();
        animal.eat();
        animal.sleep();
    }


    public String getInfo(){
        return "food='" + food + '\'' + ", location=" + location;

    }
}
