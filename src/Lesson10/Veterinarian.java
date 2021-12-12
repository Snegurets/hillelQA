package Lesson10;

public class Veterinarian {
    public static void main(String[] args) {
        Cat cat = new Cat("Рыба", "Квартира");
        Dog dog = new Dog("Корм", "Будка");
        Horse horse = new Horse("Сено", "Конюшня");
        Animal[] animals = {cat, dog, horse};
        treatAnimal(animals);
    }
    public static void treatAnimal(Animal[] animal){
        System.out.println("Animals list:");
        for (Animal animals : animal) {
            System.out.println(animals.getInfo());
        }
        System.out.println();
    }
}


