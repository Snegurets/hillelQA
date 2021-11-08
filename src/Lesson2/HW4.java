package Lesson2;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input distance in meters: ");
        float meters = sc.nextFloat();
        System.out.println("Input hour: ");
        float hour = sc.nextFloat();
        System.out.println("Input minutes: ");
        float minutes = sc.nextFloat();
        System.out.println("Input seconds: ");
        float seconds = sc.nextFloat();
        float allTimeInSeconds = (hour * 3600) + (minutes * 60) + seconds;
        float mS = meters / allTimeInSeconds;
        float metersInKm = meters / 1000.0f;
        float allTimeInHours = allTimeInSeconds / 3600.0f;
        float kmH = metersInKm / allTimeInHours;
        System.out.println("Your speed in meters/second is " + mS);
        System.out.println("Your speed in km/h is " + kmH);
    }
}
