package Lesson8;

import java.util.Scanner;

public class ArmstrongNumber {
    public String armstrongCheck() {
        System.out.println("Get your number please: ");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int num = Integer.parseInt(number);
        String arms = "Number is Armstrong";
        String notArms = "Number is not Armstrong";

        int remainder;
        int sum = 0;

        for (int i = num; i > 0; i = i / 10) {
            remainder = i % 10;
            sum = sum + remainder * remainder * remainder;
        }

        if (sum == num) {
            return arms;
        } else {
            return notArms;
        }
    }
}
