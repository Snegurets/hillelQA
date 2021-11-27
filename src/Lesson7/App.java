package Lesson7;

public class App {
    public static void main(String[] args) {
        int firstNumber = 12;
        int secondNumber = 6;
        String method = "Multiply";

        FractionNumbers fractionNumbers = new FractionNumbers(firstNumber, secondNumber, method);

        System.out.println("Method Plus: " + fractionNumbers.Plus());
        System.out.println("Method Minus: " + fractionNumbers.Minus());
        System.out.println("Method Multiply: " + fractionNumbers.Multiply());
        System.out.println("Method Divide: " + fractionNumbers.Divide());

        System.out.println("Your chosen method: " + fractionNumbers.toString());

    }
}
