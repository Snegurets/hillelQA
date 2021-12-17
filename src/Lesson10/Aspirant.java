package Lesson10;

public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public static void main(String[] args) {
        Student student = new Student("Иван","Иванов", "2", 5.0);
        Aspirant aspirant = new Aspirant("Василий", "Савчук", "1", 4.0);
        Student[] students = {student,aspirant};
        for (Student s : students){
            System.out.println(s.getScholarship());
        }
    }

    @Override
    public double getScholarship() {
        if (averageMark >= 5.0){
            return 200;
        }
        return 180;
    }
}
