package Lesson11.Task2;

public class Main {
    public static void main(String[] args) {
        Printable book = new Book("The Adventures of Sherlock Holmes");
        Printable book1 = new Book("Three Men in a Boat");
        Printable magazine = new Magazine("Cosmopolitan");
        Printable magazine1 = new Magazine("National Geographic");

        Printable[] printables = {book,book1,magazine,magazine1};
        for (Printable printable : printables){
            printable.print();
        }
    }
}
