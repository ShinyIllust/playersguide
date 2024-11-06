package Point;

import java.util.Scanner;

import static Point.Point.*;

public class Pedestal {
    public static void main(String[] args){
        Point defaultPoint = constructPoint();

        boolean runThis = true;
        int[] pointX = new int[2];
        int[] pointY = new int[2];
        int pointCount = 0;
        Point[] points = new Point[2];
        Scanner scanned = new Scanner(System.in);

        while(runThis){
            if (pointCount < 2) {
                System.out.println("Provide X");
                pointX[pointCount] = Integer.parseInt(scanned.nextLine());
                System.out.println("Provide Y");
                pointY[pointCount] = Integer.parseInt(scanned.nextLine());
                pointCount++;
            } else {
                runThis = false;
            }
        }

        for (int i = 0; i < pointCount; i++) {
            points[i] = new Point(pointX[i], pointY[i]);
        }

        System.out.println("Default point:");
        System.out.println(defaultPoint);
        System.out.println("User defined points:");

        for (Point point : points){
            System.out.println(point);
        }
    }
}
