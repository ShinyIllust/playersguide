package Inventory;

import java.util.Scanner;

public class User {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size;
        int weight;
        int volume;
        boolean addItem = true;
        String itemToAdd;

        //Make a pack
        System.out.println("Set pack size, weight, volume:");
        size = scanner.nextInt();
        weight = scanner.nextInt();
        volume = scanner.nextInt();
        scanner.nextLine();
        Pack pack = new Pack(size, weight, volume);
        System.out.println(pack);

        while (addItem) {
            //Display items
            Arrow arrow = new Arrow();
            Bow bow = new Bow();
            Food food = new Food();
            Rope rope = new Rope();
            Sword sword = new Sword();
            Water water = new Water();

            System.out.println("Pick item to add: ");
            System.out.println(arrow + ": Weight " + arrow.itemWeight + ", Volume " + arrow.itemVolume);
            System.out.println(bow + ": Weight " + bow.itemWeight + ", Volume " + bow.itemVolume);
            System.out.println(food + ": Weight " + food.itemWeight + ", Volume " + food.itemVolume);
            System.out.println(rope + ": Weight " + rope.itemWeight + ", Volume " + rope.itemVolume);
            System.out.println(sword + ": Weight " + sword.itemWeight + ", Volume " + sword.itemVolume);
            System.out.println(water + ": Weight " + water.itemWeight + ", Volume " + water.itemVolume);

            //Add item to pack
            itemToAdd = scanner.nextLine();
            switch (itemToAdd){
                case "Arrow":
                    if(pack.add(new Arrow())){
                        System.out.println("Added Arrow.");
                    } else {
                        System.out.println("Can't fit that!");
                    }
                    break;
                case "Bow":
                    if(pack.add(new Bow())){
                        System.out.println("Added Bow.");
                    } else {
                        System.out.println("Can't fit that!");
                    }
                    break;
                case "Food":
                    if(pack.add(new Food())){
                        System.out.println("Added Food.");
                    } else {
                        System.out.println("Can't fit that!");
                    }
                    break;
                case "Rope":
                    if(pack.add(new Rope())){
                        System.out.println("Added Rope.");
                    } else {
                        System.out.println("Can't fit that!");
                    }
                    break;
                case "Sword":
                    if(pack.add(new Sword())){
                        System.out.println("Added Sword.");
                    } else {
                        System.out.println("Can't fit that!");
                    }
                    break;
                case "Water":
                    if(pack.add(new Water())){
                        System.out.println("Added Water.");
                    } else {
                        System.out.println("Can't fit that!");
                    }
                    break;
                case "None":
                    System.out.println("Closing pack...");
                    addItem = false;
                    break;
                default:
                    System.out.println("Invalid item.");
            }
            System.out.println(pack);
        }

    }
}