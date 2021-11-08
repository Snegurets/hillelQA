package Lesson2;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the starting number of the range: ");
        int startingNumber = sc.nextInt();
        System.out.println("Input the ending number of the range: ");
        int endingNumber = sc.nextInt();
        int randomNumber = (int) (endingNumber + (Math.random() * ((startingNumber - endingNumber) +1)));
        System.out.println(randomNumber);
    }
}
