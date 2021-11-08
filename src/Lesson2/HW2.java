package Lesson2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        int minutesInYear = 60 * 24 * 365;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of minutes: ");
        int minutes = sc.nextInt();
        int years = minutes / minutesInYear;
        int days = (minutes / 60 / 24) % 365;
        System.out.println( minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
