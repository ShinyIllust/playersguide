package Assignments2.Monday;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float temp;

        System.out.println("F or C?");
        String type = scanner.nextLine();
        if(type.equals("C")){
            System.out.println("Enter temperature (C)");
            temp = scanner.nextFloat();
            temp = (temp * ((float) 9/5)) + 32;
            System.out.println(temp + "F");
        } else {
            System.out.println("Enter temperature (F)");
            temp = scanner.nextFloat();
            temp = (temp - 32 ) * ((float) 5/9);
            System.out.println(temp + "C");
        }
    }
}
