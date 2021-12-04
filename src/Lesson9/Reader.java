package Lesson9;

public class Reader {
    private String FIO;
    private int numberTicket;
    private String department;
    private String birthdate;
    private String numberPhone;

    public Reader(String FIO, int numberTicket, String department, String birthdate, String numberPhone){
        this.FIO = FIO;
        this.numberTicket = numberTicket;
        this.department = department;
        this.birthdate = birthdate;
        this.numberPhone = numberPhone;
    }

    public String getFIO(){
        return FIO;
    }
    public int getIdNumber(){
        return numberTicket;
    }
    public String getDepartment(){
        return department;
    }
    public String getBirthdate(){
        return birthdate;
    }
    public String getNumberPhone(){
        return numberPhone;
    }

    public void takeBook(int numberBooks){
        System.out.println(FIO + " взял " + numberBooks + " книги");
    }
    public void takeBook(String... books){
        System.out.println(FIO + " взял такие книги: ");
        for (String book : books){
            System.out.println(book);
        }
        System.out.println();
    }
    public void takeBook(Book... books){
        System.out.println(FIO + " вернул следующие книги: ");
        for (Book book : books){
            System.out.println(book.getName() + ", автор - " + book.getAuthor());
        }
        System.out.println();
    }
    public String getInfo() {
        return "FIO = '" + FIO + '\'' +
                ", numberTicket =" + numberTicket +
                ", department = '" + department + '\'' +
                ", birthdate = '" + birthdate + '\'' +
                ", numberPhone = '" + numberPhone + '\'';
    }
}
