package Door;

import java.util.Scanner;

import static Door.Door.*;

public class PedestalDoor {
    public static void main(String[] args){

        boolean runProgram = true;
        int passCode;
        int passCodeCompare;
        String command;
        Scanner scanner = new Scanner(System.in);
        String errorText = "Cannot perform this action.";

        System.out.println("Enter Passcode:");
        passCode = scanner.nextInt();
        scanner.nextLine();
        Door door = constructDoor(passCode);
        System.out.println(door);

        while(runProgram){
            System.out.println("What to do? (OPEN, CLOSE, LOCK, UNLOCK, END)");
            command = scanner.nextLine();
            command = command.toUpperCase();

            switch (command){
                case "OPEN":
                    if (door.doorState == 1){
                        door.doorState = 0;
                    } else {
                        System.out.println(errorText);
                    }
                    break;
                case "CLOSE":
                    if (door.doorState == 0){
                        door.doorState = 1;
                    } else {
                        System.out.println(errorText);
                    }
                    break;
                case "LOCK":
                    if (door.doorState == 1){
                        door.doorState = 2;
                    } else {
                        System.out.println(errorText);
                    }
                    break;
                case "UNLOCK":
                    if (door.doorState == 2){
                        System.out.println("Submit Passcode: ");
                        passCodeCompare = scanner.nextInt();
                        scanner.nextLine();
                        if (passCode == passCodeCompare) {
                            door.doorState = 1;
                        } else {
                            System.out.println("Invalid Passcode.");
                        }
                    } else {
                        System.out.println(errorText);
                    }
                    break;
                case "END":
                    System.out.println("Goodbye.");
                    runProgram = false;
                    break;
                default:
                    System.out.println(errorText);
                    break;
            }
            System.out.println(door);
        }
    }
}
