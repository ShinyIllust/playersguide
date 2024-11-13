package Robot;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String command;
        List<RobotCommand> inputCommands = new java.util.ArrayList<>(List.of());

        System.out.println("Input Commands: ");
        for(int i = 0; i < 3; i++){
            command = scanner.nextLine().toLowerCase();
            switch (command){
                case "on":
                    inputCommands.add(new OnCommand());
                    break;
                case "off":
                    inputCommands.add(new OffCommand());
                    break;
                case "north":
                    inputCommands.add(new NorthCommand());
                    break;
                case "south":
                    inputCommands.add(new SouthCommand());
                    break;
                case "west":
                    inputCommands.add(new WestCommand());
                    break;
                case "east":
                    inputCommands.add(new EastCommand());
                    break;
                default:
                    System.out.println("Invalid Command.");
            }
        }
        Robot robot = new Robot(inputCommands);
        robot.run();
    }
}
