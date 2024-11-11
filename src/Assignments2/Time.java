package Assignments2;

import java.util.Scanner;

public class Time {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int years;
        int months;
        int weeks;
        int days;
        int hours;
        int minutes;

        System.out.println("Years");
        years = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Months");
        months = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Weeks");
        weeks = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Days");
        days = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hours");
        hours = scanner.nextInt();
        scanner.nextLine();

        months = months + (years * 12);
        weeks = weeks + (months * 4);
        days = days + (weeks * 7);
        hours = hours + (days * 24);
        minutes = hours * 60;

        System.out.println("Minutes: " + minutes);

    }
}
