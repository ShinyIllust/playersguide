package Fletcher;

import java.util.Scanner;

public class Arrow {
    String arrowhead;
    String fletching;
    double length;
    double cost;
    int materialCost;


    Arrow(String arrowhead, String fletching, double length){

        //Define materials and length
        this.arrowhead = arrowhead;
        this.fletching = fletching;
        this.length = length;

        //Determine total cost
        switch(this.arrowhead) {
            case "STEEL":
                materialCost = Material.STEEL.cost;
                this.cost = this.cost + materialCost;
                break;
            case "WOOD":
                materialCost = Material.WOOD.cost;
                this.cost = this.cost + materialCost;
                break;
            case "OBSIDIAN":
                materialCost = Material.OBSIDIAN.cost;
                this.cost = this.cost + materialCost;
                break;
            default:
                System.out.println("Invalid arrowhead material.");
                return;
        }

        switch(this.fletching) {
            case "PLASTIC":
                materialCost = Material.PLASTIC.cost;
                this.cost = this.cost + materialCost;
                break;
            case "TURKEY":
                materialCost = Material.TURKEY.cost;
                this.cost = this.cost + materialCost;
                break;
            case "GOOSE":
                materialCost = Material.GOOSE.cost;
                this.cost = this.cost + materialCost;
                break;
            default:
                System.out.println("Invalid fletching material.");
                return;
        }

        if (this.length > 0) {
            this.cost = this.cost + (this.length * 0.05);
        } else {
            System.out.println("Invalid length.");
        }
    }

    public static Arrow createArrow(String arrowtype){
        String[] arrowheads = {"STEEL", "WOOD", "OBSIDIAN"};
        String[] fletchings = {"PLASTIC", "TURKEY", "GOOSE"};
        Scanner scanned = new Scanner(System.in);
        Arrow a1 = null;

        switch(arrowtype) {
            case "ELITE":
                a1 = new Arrow("STEEL", "PLASTIC", 95.0);
                break;
            case "BEGINNER":
                a1 = new Arrow("WOOD", "GOOSE", 75.0);
                break;
            case "MARKSMAN":
                a1 = new Arrow("STEEL", "GOOSE", 65.0);
                break;
            case "CUSTOM":
                //Ask user for arrowhead, fletching and length
                String arrowhead;
                String fletching;
                double length;

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
                a1 = new Arrow(arrowhead, fletching, length);
                break;
            default:
                System.out.println("Invalid arrow type");
                break;
        }
        return a1;
    }
}
