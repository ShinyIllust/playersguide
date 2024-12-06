package NestedLoop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("Tafelmaker: Geef de grootte aan: ");
        size = scanner.nextInt();

        for(int x = 0; x <= size; x++){
            if (x != 0) {
                System.out.print(" " + x + " ");
            }
            for(int y = 0; y <= size; y++){
                if(x != 0 && y != 0){
                    System.out.print(" " + x * y + " ");
                } else {
                    if (x == 0) {
                        System.out.print(" " + y + " ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}
