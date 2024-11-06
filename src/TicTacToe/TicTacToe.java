package TicTacToe;

import java.util.HashMap;
import java.util.Scanner;

public class TicTacToe {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String p1;
        String p2;
        boolean startingPlayer= true;
        boolean gameLoop = true;
        int selectedField;
        HashMap<Integer, Integer> turnLog = new HashMap<>();
        int turnCount = 1;

        System.out.println("P1 Enter Name:");
        p1 = scanner.nextLine();
        System.out.println("P2 Enter Name:");
        p2 = scanner.nextLine();
        System.out.println("Generating Board State...");
        Board boardStart = new Board();
        System.out.println(boardStart);
        while(gameLoop){
            if(turnCount == 10){
                System.out.println("It's a tie!");
                gameLoop = false;
            } else {
                if(startingPlayer) {
                    System.out.println(p1 + "'s Turn!");
                } else {
                    System.out.println(p2 + "'s Turn!");
                }
                System.out.println("Select a Field:");
                selectedField = scanner.nextInt();
                scanner.nextLine();
                if(selectedField >= 1 && selectedField <= 9){
                    if(!turnLog.isEmpty() && turnLog.containsValue(selectedField)){
                        System.out.println("That field is already taken! Try again.");
                    } else {
                        turnLog.put(turnCount, selectedField);
                        Board board = new Board(turnLog);
                        System.out.println(board);
                        if(board.winner == 1){
                            System.out.println(p1 + " wins!");
                            gameLoop = false;
                        } else if(board.winner == 2){
                            System.out.println(p2 + " wins!");
                            gameLoop = false;
                        } else{
                            turnCount++;
                            startingPlayer = !startingPlayer;
                        }
                    }
                } else {
                    System.out.println("Invalid field! Try again.");
                }
            }
        }
    }
}
