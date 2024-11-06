package Cards;

public class Card {
    int color;
    int rank;
    int ID;
    String colorName;
    String rankName;

    Card(int color, int rank, int ID){
        this.color = color;
        this.rank = rank;
        this.ID = ID;
    }

    public String toString(){
        switch(color){
            case 1:
                colorName = CardColor.RED.name();
                break;
            case 2:
                colorName = CardColor.GREEN.name();
                break;
            case 3:
                colorName = CardColor.BLUE.name();
                break;
            case 4:
                colorName = CardColor.YELLOW.name();
                break;
        }

        switch(rank){
            case 11:
                rankName = CardRank.DOLLAR.name();
                break;
            case 12:
                rankName = CardRank.PERCENT.name();
                break;
            case 13:
                rankName = CardRank.CARET.name();
                break;
            case 14:
                rankName = CardRank.AMPERSAND.name();
                break;
            default:
                rankName = String.valueOf(rank);
        }
        return "THE " + colorName + " " + rankName;
    }
}
