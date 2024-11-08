package EndAssignment1;

public class Card {
    private final int suit;
    private final int rank;
    int value;
    String suitName;
    String rankName;

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

        switch(rank){
            case 11:
                rankName = CardRank.JACK.name();
                break;
            case 12:
                rankName = CardRank.QUEEN.name();
                break;
            case 13:
                rankName = CardRank.KING.name();
                break;
            default:
                rankName = String.valueOf(rank);
        }
        return rankName + " OF " + suitName;
    }
}
