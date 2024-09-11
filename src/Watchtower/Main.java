package Watchtower;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner getXY = new Scanner(System.in);

        String msgX = "Enter X";
        String msgY = "Enter Y";
        String msgHere = "The enemy is here!";
        String msgDirection = "The enemy is to the: ";
        String compNorth = "north";
        String compSouth = "south";
        String compEast = "east";
        String compWest = "west";
        String[] direction = {"",""};


        System.out.println(msgY);
        int Y = getXY.nextInt();

        System.out.println(msgX);
        int X = getXY.nextInt();

        if(Y == 0 && X == 0) {
            System.out.println(msgHere);
        } else {
            if(Y != 0) {
                if(Y != 0 && Y > 0) {
                    direction[0] = compNorth;
                } else {
                    direction[0] = compSouth;
                }
            }
            if(X != 0) {
                if(X > 0) {
                    direction[1] = compEast;
                } else {
                    direction[1] = compWest;
                }
            }
            for(String i : direction) {
                msgDirection = msgDirection + i;
            }
            System.out.println(msgDirection);
        }
    }

}
