package Lesson7;

public class Teacher {
    private String name;
    private String secondName;
    private int age;

    public Teacher(String name, String secondName, int age){
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }


    @Override
    public String toString(){
        return "Teacher name: " + name + ". Teacher second name: " + secondName + ". Teacher age : " + age + ".";
    }
}
