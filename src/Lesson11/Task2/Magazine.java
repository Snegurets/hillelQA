package Lesson11.Task2;

public class Magazine implements Printable{
    String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Printable printable = new Magazine("Cosmopolitan");
        Printable printable1 = new Magazine("National Geographic");
        Printable[] printables = {printable, printable1};
    }
    static void printMagazines(Printable...printables){
        for (Printable printable : printables){
            if (printable instanceof Magazine){
                printable.print();
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Magazine Name: " + getName());

    }
}
