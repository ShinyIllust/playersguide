package EndAssignment1;

public class Card {
    private final int suit;
    private final int rank;
    protected int value;
    private String suitName;

    protected Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
        //Set face cards to a value of 10, set Aces to a value of 11.
        if(rank >= 11){
            this.value = 10;
        } else if (rank == 1){
            this.value = 11;
        } else {
            this.value = rank;
        }
    }

    public String toString(){
        switch(suit){
            case 1:
                suitName = "♥";
                break;
            case 2:
                suitName = "♦";
                break;
            case 3:
                suitName = "♠";
                break;
            case 4:
                suitName = "♣";
                break;
        }

        String rankName = switch (rank) {
            case 11 -> "JACK";
            case 12 -> "QUEEN";
            case 13 -> "KING";
            default -> String.valueOf(rank);
        };
        return rankName + " OF " + suitName;
    }
}
