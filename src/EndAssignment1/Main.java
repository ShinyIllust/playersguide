package EndAssignment1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Rules: Players draw cards from their shuffled deck.
         * Before each draw, players can choose to drop out of the round.
         * If a player's hand exceeds 21 or both players drops out, the round ends.
         * Aces count as 11, unless this would exceed 21, where they will count as 1.
         * Face cards count as 10.
         * On a win, inflict damage equal to your card score difference to the opponent.
         * If your hand exceeded 21, your card score is set to 0;
         * A player has 30 hit points. losing all means you lose the game!
         */

        Scanner scanner = new Scanner(System.in);
        boolean playGame = true;
        boolean activeTurn = true;
        int turnCount = 0;

        //Initialize players and their decks, then draw two cards.
        System.out.println("Player 1: Enter name.");
        Player playerOne = new Player(scanner.nextLine());

        System.out.println("Player 2: Enter name");
        Player playerTwo = new Player(scanner.nextLine());

        //Start the game.
        while (playGame) {
            if (activeTurn) {

                //On a new round, display HP and draw two cards.
                if (turnCount == 0) {
                    System.out.println(playerOne.name + " has " + playerOne.hitPoints + " HP.");
                    playerOne.drawTwo();
                }

                playerOne.takeTurn(turnCount);
                if (playerTwo.inTheGame) {
                    activeTurn = false;
                } else {
                    turnCount++;
                }
            } else {

                //On a new round, display HP and draw two cards.
                if (turnCount == 0) {
                    System.out.println(playerTwo.name + " has " + playerTwo.hitPoints + " HP.");
                    playerTwo.drawTwo();
                }

                playerTwo.takeTurn(turnCount);
                if (playerOne.inTheGame) {
                    activeTurn = true;
                }
                turnCount++;
            }

            //When both players are out of the game, end the round and determine the winner.
            if (!playerOne.inTheGame && !playerTwo.inTheGame) {
                turnCount = 0;
                activeTurn = true;
                playerOne.clearHand();
                playerTwo.clearHand();
                if (playerOne.lastScore > playerTwo.lastScore) {
                    System.out.println(playerOne.name + " wins the round!");
                    playerTwo.defend(playerOne.attack());
                } else if (playerOne.lastScore < playerTwo.lastScore) {
                    System.out.println(playerTwo.name + " wins the round!");
                    playerOne.defend(playerTwo.attack());
                } else {
                    System.out.println("It's a tie!");
                }
            }

            //When a player's HP drops to 0, end the game.
            if (playerOne.hitPoints <= 0) {
                System.out.println(playerOne.name + " has been defeated! " + playerTwo.name + " wins!");
                playGame = false;
            }
            if (playerTwo.hitPoints <= 0) {
                System.out.println(playerTwo.name + " has been defeated! " + playerOne.name + " wins!");
                playGame = false;
            }
        }
    }
}
