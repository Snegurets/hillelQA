package Lesson8;

import java.util.Scanner;

public class OptionTypeOfNumber {
    public String getOptionTypeOfNumber(){
        System.out.println("What are you need type of number?:\n 1. Even Number \n 2. Armstrong\n 3. Reverse\n 4. Fibonacci\n 5. Replace");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        switch(num) {
            case 1:
                EvenNumber evenNumber = new EvenNumber();
                return evenNumber.getEvenNumber();
            case 2:
                ArmstrongNumber armstrongNumber = new ArmstrongNumber();
                return armstrongNumber.armstrongCheck();
            case 3:
                Reverse reverseNumber = new Reverse();
                return reverseNumber.reverseCheck();
            case 4:
                Fibonacci fibonacciNumber = new Fibonacci();
                return fibonacciNumber.getFibonacciNumber();
            case 5:
                Replace replaceNumber = new Replace();
                return replaceNumber.getReplace();
            default:
                return "Wrong type. Try again" ;
        }
    }
}
