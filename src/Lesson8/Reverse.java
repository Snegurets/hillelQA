package Lesson8;

import java.util.Scanner;

public class Reverse {
    public String reverseCheck() {
        System.out.println("Get your number please: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine(), stringTwo = " ";

        char ch;
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            stringTwo = ch + stringTwo;
        }
        return stringTwo;
    }
}
