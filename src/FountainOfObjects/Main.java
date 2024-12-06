package FountainOfObjects;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        World world;
        Player player;
        String command;
        boolean runGame = true;
        String selectedSize;
        int size = 0;
        String message;

        do {
            System.out.println("Select World Size:");
            System.out.println(Arrays.toString(Size.values()));
            selectedSize = scanner.nextLine().toUpperCase();

            switch (selectedSize) {
                case "SMALL":
                    size = Size.SMALL.size;
                    break;
                case "MEDIUM":
                    size = Size.MEDIUM.size;
                    break;
                case "LARGE":
                    size = Size.LARGE.size;
                    break;
                default:
                    System.out.println("Invalid Size.");
            }
        } while (size == 0);

        world = new World(size);
        player = new Player(0, 0, size);

        while (runGame) {
            System.out.println("----------------------------------------------------------------------------------");
            //Announce what room the player is currently in.
            System.out.println("You are in the room at (" + player.x + ", " + player.y + ")");
            System.out.println(world.rooms[player.x][player.y].announce());
            //Check if this room kills you.
            world.rooms[player.x][player.y].checkDanger();
            //Check if an adjacent room contains a hazard.
            if (world.rooms[player.x][player.y].x > 0){
                message = world.rooms[player.x - 1][player.y].announceAdjacent();
                if(!Objects.equals(message, "")){
                    System.out.println(message);
                }
            }
            if (world.rooms[player.x][player.y].x < world.size - 1){
                message = world.rooms[player.x + 1][player.y].announceAdjacent();
                if(!Objects.equals(message, "")){
                    System.out.println(message);
                }
            }
            if (world.rooms[player.x][player.y].y > 0){
                message = world.rooms[player.x][player.y - 1].announceAdjacent();
                if(!Objects.equals(message, "")){
                    System.out.println(message);
                }
            }
            if (world.rooms[player.x][player.y].y < world.size - 1){
                message = world.rooms[player.x][player.y + 1].announceAdjacent();
                if(!Objects.equals(message, "")){
                    System.out.println(message);
                }
            }
            if (world.rooms[player.x][player.y].x > 0 && world.rooms[player.x][player.y].y > 0){
                message = world.rooms[player.x - 1][player.y - 1].announceAdjacent();
                if(!Objects.equals(message, "")){
                    System.out.println(message);
                }
            }
            if (world.rooms[player.x][player.y].x < world.size - 1 && world.rooms[player.x][player.y].y < world.size - 1){
                message = world.rooms[player.x + 1][player.y + 1].announceAdjacent();
                if(!Objects.equals(message, "")){
                    System.out.println(message);
                }
            }
            if (world.rooms[player.x][player.y].x > 0 && world.rooms[player.x][player.y].y < world.size - 1){
                message = world.rooms[player.x - 1][player.y + 1].announceAdjacent();
                if(!Objects.equals(message, "")){
                    System.out.println(message);
                }
            }
            if (world.rooms[player.x][player.y].x < size && world.rooms[player.x][player.y].y > 0){
                message = world.rooms[player.x + 1][player.y - 1].announceAdjacent();
                if(!Objects.equals(message, "")){
                    System.out.println(message);
                }
            }
            System.out.println("What do you want to do?");
            command = scanner.nextLine().toUpperCase();

            switch (command) {
                case "MOVE NORTH":
                    if (!player.goNorth()) {
                        System.out.println("Can't go there!");
                    }
                    break;
                case "MOVE SOUTH":
                    if (!player.goSouth()) {
                        System.out.println("Can't go there!");
                    }
                    break;
                case "MOVE EAST":
                    if (!player.goEast()) {
                        System.out.println("Can't go there!");
                    }
                    break;
                case "MOVE WEST":
                    if (!player.goWest()) {
                        System.out.println("Can't go there!");
                    }
                    break;
                case "ENABLE FOUNTAIN":
                    if (world.rooms[player.x][player.y].feature == 2) {
                        world.rooms[player.x][player.y].feature = 3;
                        player.hasEnabledFountain = true;
                    } else {
                        System.out.println("You can't do that here!");
                    }
                    break;
                case "LEAVE":
                    if (world.rooms[player.x][player.y].feature == 1) {
                        if (player.hasEnabledFountain) {
                            System.out.println("The Fountain of Objects has been reactivated, and you have escaped with your life!");
                            runGame = false;
                        } else {
                            System.out.println("You must first activate the Fountain of Objects!");
                        }
                    } else {
                        System.out.println("You can't do that here!");
                    }
                    break;
                case "SHOOT NORTH":
                    if(!player.shootNorth()){
                        System.out.println("Can't shoot there!");
                    } else {
                        if(world.rooms[player.x][player.y + 1].feature == 5 || world.rooms[player.x][player.y + 1].feature == 6){
                            System.out.println("You hit something! The monster is no more!");
                            world.rooms[player.x][player.y + 1].feature = 0;
                        } else {
                            System.out.println("Your arrow did not hit anything...");
                        }
                    }
                    break;
                case "SHOOT SOUTH":
                    if(!player.shootSouth()){
                        System.out.println("Can't shoot there!");
                    } else {
                        if(world.rooms[player.x][player.y - 1].feature == 5 || world.rooms[player.x][player.y - 1].feature == 6){
                            System.out.println("You hit something! The monster is no more!");
                            world.rooms[player.x][player.y - 1].feature = 0;
                        } else {
                            System.out.println("Your arrow did not hit anything...");
                        }
                    }
                    break;
                case "SHOOT WEST":
                    if(!player.shootWest()){
                        System.out.println("Can't shoot there!");
                    } else {
                        if(world.rooms[player.x - 1][player.y].feature == 5 || world.rooms[player.x - 1][player.y].feature == 6){
                            System.out.println("You hit something! The monster is no more!");
                            world.rooms[player.x - 1][player.y].feature = 0;
                        } else {
                            System.out.println("Your arrow did not hit anything...");
                        }
                    }
                    break;
                case "SHOOT EAST":
                    if(!player.shootEast()){
                        System.out.println("Can't shoot there!");
                    } else {
                        if(world.rooms[player.x + 1][player.y].feature == 5 || world.rooms[player.x + 1][player.y].feature == 6){
                            System.out.println("You hit something! The monster is no more!");
                            world.rooms[player.x + 1][player.y].feature = 0;
                        } else {
                            System.out.println("Your arrow did not hit anything...");
                        }
                    }
                    break;
            }
        }
    }
}
