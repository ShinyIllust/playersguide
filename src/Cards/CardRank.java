package Cards;

public enum CardRank {
    //Rank
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    DOLLAR(11),
    PERCENT(12),
    CARET(13),
    AMPERSAND(14);

    int worth;
    CardRank(int worth){
        this.worth = worth;
    }

}
