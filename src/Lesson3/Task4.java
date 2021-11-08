package Lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        String name = "Yuriy";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = sc.nextLine();
        if (!name.equals(userName)) {
            System.out.println("Error");
        }

        String pass = "GJjkHNmd";
        System.out.println("Enter your pass: ");
        String userPass = sc.nextLine();
        if (userPass.length() == pass.length()) {
            System.out.println("Great!");
        } else {
            System.out.println("Error");
        }
    }
}