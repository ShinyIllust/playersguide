package Assignments2.Monday;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args){
        int distance;
        int hours;
        int minutes;
        int seconds;
        float speed;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Distance (M):");
        distance = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hours:");
        hours = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Minutes:");
        minutes = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Seconds:");
        seconds = scanner.nextInt();
        scanner.nextLine();

        seconds = seconds + ((minutes + (hours * 60)) * 60);
        speed = (float) distance / seconds;
        System.out.println(speed + " m/s");

        speed = speed * 3.6f;
        System.out.println(speed + " km/h");

        speed = speed / 1.609f;
        System.out.println(speed + " mph");
    }
}
