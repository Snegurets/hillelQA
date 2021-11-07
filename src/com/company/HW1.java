package com.company;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        double oneMeter = 0.0254;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Input a value for inch: ");
        double inch = sc.nextDouble();
        double meters = inch*oneMeter;
        System.out.println("1000.0 inch is " + meters + " meters");

    }
}
