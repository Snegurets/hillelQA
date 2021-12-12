package Lesson8;

public class Fibonacci {
    public String getFibonacciNumber() {


        int n1 = 0;
        int n2 = 1;
        int n = 0;
        String result = "";

        for (int i = 1; i <= 50; i++) {
            n1 = n2;
            n2 = n;
            n = n1 + n2;
            if (n < 50) {
                result += n + " ";
            }
        }
        return result;
    }
}
