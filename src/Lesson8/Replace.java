package Lesson8;

import java.util.Scanner;

public class Replace {
    public String getReplace(){
        System.out.println("Get your string please: ");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        if(num.length() <= 30){
            String result = num.replaceAll("[a]", "@");
            result = result.replaceAll("[o]", "0");
            return result;
        } else {
            return "Your String is is more than 30. Try again.";
        }
    }
}
