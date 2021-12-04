package Lesson8;

import java.util.Scanner;

public class EvenNumber {
    public String getEvenNumber(){
        String result = "";
        String string = getNumberEvenOrOdd();
        switch(string) {
            case "true":
                return result += "Your number is even.";
            case "false":
                return result += "Your number is odd.";
            case "error":
                return result += "Write integer.";
            default:
                return "Error. Try again.";
        }
    }
    private String getNumberEvenOrOdd() {
        System.out.println("Get your number please: ");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        num = num.replaceAll("[A-Za-z]", "");
        if(num.length() > 0) {
            int number = Integer.parseInt(num);
            if (number % 2 == 0) {
                return "true";
            } else {
                return "false";
            }
        }
        return "error";
    }
}



