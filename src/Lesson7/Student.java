package Lesson7;

public class Student {
    private String name;
    private String secondName;
    private int age;
    private String department;

    public Student(String name, String secondName, int age, String department){
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.department = department;
    }
    @Override
    public String toString(){
        return "Student name: " + name + ". Student second name: " + secondName + ". Student age: " + age + ". Student department: " + department + ".";
    }

}
