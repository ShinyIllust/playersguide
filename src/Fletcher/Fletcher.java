package Fletcher;

import java.util.Scanner;

public class Fletcher {

    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);

        String[] arrowheads = {"STEEL", "WOOD", "OBSIDIAN"};
        String[] fletchings = {"PLASTIC", "TURKEY", "GOOSE"};

        //Ask user for arrowhead, fletching and length
        String arrowhead;
        String fletching;
        double length;
        double cost = 0;

        System.out.println("Select arrowhead type:");
        for (String i : arrowheads) {
            System.out.println(i);
        }
        arrowhead = scanned.nextLine();
        arrowhead = arrowhead.toUpperCase();

        System.out.println("Select fletching type:");
        for (String i : fletchings) {
            System.out.println(i);
        }
        fletching = scanned.nextLine();
        fletching = fletching.toUpperCase();

        System.out.println("Select length:");
        length = scanned.nextFloat();

        //Define new arrow
        Arrow a1 = new Arrow(arrowhead, fletching, length, cost);

        System.out.println("Total cost: " + a1.cost + " gold.");
    }
}
