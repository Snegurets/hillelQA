package Lesson3;

public class Magnitude {
    public static void main(String[] args){
        int numberOne = 3;
        int numberTwo = -9;
        if (Math.abs(numberOne) < Math.abs(numberTwo)){
            System.out.println("The number " + numberTwo + " has the greatest magnitude");
        } else if (Math.abs(numberOne) > Math.abs(numberTwo)){
            System.out.println("The number " + numberOne + " has the greatest magnitude");
        } else {
            System.out.println(numberOne + " and " + numberTwo + " are equal");
        }
    }
}
