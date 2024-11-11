package EndAssignment1;

public final class Card {
    private final int suit;
    private final int rank;
    int value;
    private String suitName;

    Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
        //Set face cards to a value of 10, set Aces to a value of 11.
        if (rank >= 11) {
            this.value = 10;
        } else if (rank == 1) {
            this.value = 11;
        } else {
            this.value = rank;
        }
    }

    public String toString() {
        switch (suit) {
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
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> String.valueOf(rank);
        };
        return rankName + " of " + suitName;
    }
}
