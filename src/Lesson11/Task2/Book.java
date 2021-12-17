package Lesson11.Task2;

public class Book implements Printable {
    String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Printable printable = new Book("The Adventures of Sherlock Holmes");
        Printable printable1 = new Book("Three Men in a Boat");
        Printable[] printables = {printable, printable1};

    }
    static void printBooks(Printable... printables){
        for (Printable printable : printables){
            if (printable instanceof Book){
                printable.print();
            }
        }

    }

    @Override
    public void print() {
        System.out.println("Book Name: " + getName());
    }
}
