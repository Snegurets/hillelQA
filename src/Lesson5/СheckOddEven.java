package Lesson5;

public class СheckOddEven {
    public static void main(String[] args) {
        System.out.println(isEvenOrOdd(3));
    }

    public static boolean isEvenOrOdd (int num){
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
