package Cards;

public class PedestalCards{
    public static void main(String[] args){
        int cardID = 0;
        for(int i = 0; i < CardColor.values().length; i++) {
            for (int j = 0; j < CardRank.values().length; j++) {
                Card newCard;
                newCard = new Card(i + 1, j + 1, cardID);
                System.out.println(newCard);
                cardID++;
            }
        }
    }
}
