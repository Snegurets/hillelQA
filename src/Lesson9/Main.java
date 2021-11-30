package Lesson9;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1, "MEIM", "30.11.2000", "+380636374000");
        Reader reader2 = new Reader("Иванов А.Ю.", 2, "MEIM", "05.04.1996", "+380636374001");
        Reader reader3 = new Reader("Соколов Б.А.", 3, "MEIM", "25.09.1999", "+380636374002");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Приключения", "Автор не указан");
        Book book2 = new Book("Словарь", "Кузнецов С. А.");
        Book book3 = new Book("Энциклопедия", "Каспарова Ю.В.");
        Book[] books = {book1, book2, book3};

        reader1.takeBook(3);
        reader2.takeBook("JAVA для чайников", "Как стать AQA", "Регулярные выражения");
        reader3.takeBook(book1,book2,book3);

        printReaders(readers);
        printBooks(books);


    }
    public static void printBooks(Book... books){
        System.out.println("Список книг: ");
        for (Book book : books){
            System.out.println(book.getInfo());
        }
        System.out.println();
    }
    public static void printReaders(Reader... readers){
        System.out.println("Список читателей: ");
        for (Reader reader : readers){
            System.out.println(reader.getInfo());
        }
        System.out.println();
    }
}
