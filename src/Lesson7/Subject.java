package Lesson7;

public class Subject {
    private String name;
    private int hourTime;
    private int grade;

    public Subject(String name, int hourTime, int grade){
        this.name = name;
        this.hourTime = hourTime;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "Subject name: " + name + ". Subject time: " + hourTime + ". Subject grade: " + grade + ".";
    }
}
