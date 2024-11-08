package EndAssignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    protected int hitPoints;
    protected String name;
    protected Card[] hand = new Card[11];
    private final Deck deck;
    private int score = 0;
    protected int lastScore;
    protected boolean inTheGame = true;

    private final Scanner scanner = new Scanner(System.in);

    Player(String name){
        this.hitPoints = 30;
        this.name = name;
        this.deck = new Deck();
        deck.shuffleDeck();
    }

    protected void drawTwo(){
        hand[0] = deck.drawCard();
        hand[1] = deck.drawCard();
        inTheGame = true;
    }

    protected void takeTurn(int turnCount){
        System.out.println(name + "'s turn!");
        System.out.print("Your hand: ");
        System.out.println(Arrays.toString(hand));

        //Check the score of the player's hand
        System.out.println("Hand score: " + checkScore());

        System.out.println("What do you do? (HIT, STAND)");
        String action = scanner.nextLine().toUpperCase();
        switch(action){
            case "HIT":
                hand[turnCount + 2] = turnHit();
                System.out.println("Hand score: " + checkScore());
                break;
            case "STAND":
                turnStand();
                break;
            default:
                System.out.println("Invalid command. Try again.");
        }
    }

    private int checkScore(){
        for(Card card : hand){
            if (card != null) {
                score = score + card.value;
            }
        }
        //If the score is above 21 and an ace is present, have it count as 1 rather than 11.
        if(score > 21){
            for(Card card : hand){
                if (card != null) {
                    if (card.value == 11){
                        score = score - 10;
                    }
                }
            }
        }

        //Log the player's last score.
        lastScore = score;
        score = 0;

        //Bust the player if their score is above 21.
        if(lastScore > 21){
            goBust();
        }
        return lastScore;
    }

    private Card turnHit(){
        Card card = deck.drawCard();
        System.out.println("You drew: " + card);
        return card;
    }

    private void turnStand(){
        System.out.println(name + " stands!");
        inTheGame = false;
    }

    private void goBust(){
        System.out.println("BUST!");
        lastScore = 0;
        inTheGame = false;
    }

    protected int attack(){
        System.out.println(name + " attacks!");
        return lastScore;
    }

    protected void defend(int attack){
        System.out.println((attack - lastScore) + " damage!");
        hitPoints = hitPoints - (attack - lastScore);
        System.out.println(name + " has " + hitPoints + " HP left!");
    }
}
