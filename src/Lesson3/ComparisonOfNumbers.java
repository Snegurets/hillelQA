package Lesson3;

public class ComparisonOfNumbers {
    public static void main(String[] args) {
        int numberOne = 3;
        int numberTwo = 5;
        if (numberOne < numberTwo){
            System.out.println("The number " + numberTwo + " has the greatest value");
        } else if (numberOne > numberTwo){
            System.out.println("The number " + numberOne + " has the greatest value");
        } else {
            System.out.println(numberOne + " and " + numberTwo + " are equal");
        }
    }
}
