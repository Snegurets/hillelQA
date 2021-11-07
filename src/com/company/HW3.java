package com.company;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input weight in pounds: ");
        int pounds = sc.nextInt();
        double weightInKg = pounds * 0.4535923745;
        System.out.println("Input height in inches: ");
        double meter = 0.0254;
        int inches = sc.nextInt();
        double heightInMeters2 = inches * meter * inches * meter;
        double BMI = weightInKg / heightInMeters2;
        System.out.println("Body Mass Index is: " + BMI);
    }

}
