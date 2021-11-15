package Lesson3;

public class Equation {
    public static void main(String[] args){
        int a = 0;
        int b = 3;
        int x = -b / a;

        if (b == 0){
            System.out.println("0");
        } else if (a == 0) {
            System.out.println("Error");
        } else {
            System.out.println(x);
        }
    }
}
