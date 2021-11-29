package Lesson5;

public class Equation {
    public static void main(String[] args) {
        int a = 0;
        int b = 3;
        int x = -b / a;
        equation(a,b,x);
    }
    public static void equation (int a, int b, int x){
        if (b == 0){
            System.out.println("0");
        } else if (a == 0) {
            System.out.println("Error");
        } else {
            System.out.println(x);
        }
    }
}

