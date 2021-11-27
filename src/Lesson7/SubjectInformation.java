package Lesson7;

public class SubjectInformation {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Tatiana", "Petrova", 35);
        Student student = new Student("Anna", "Shkatunova", 20, "Personnel Management, Sociology and Psychology Department");
        Subject subject = new Subject("Personnel management", 45, 90);

        System.out.println(teacher.toString());
        System.out.println(student.toString());
        System.out.println(subject.toString());
    }
}
