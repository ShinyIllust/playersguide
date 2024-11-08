package EndAssignment1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    int cardsDrawn = -1;

    Card[] deck = new Card[52];

    Deck(){
        //Create a deck of cards, one of each combination of suit and rank.
        int cardIndex = 0;
        for(int s = 1; s <= 4; s++){
            for(int r = 1; r <= 13; r++){
                deck[cardIndex] = new Card(s, r);
                cardIndex++;
            }
        }
    }

    void shuffleDeck(){
        List<Card> deckList = Arrays.asList(this.deck);
        Collections.shuffle(deckList);
        deckList.toArray(new Card[0]);
    }

    Card drawCard(){
        cardsDrawn++;
        return deck[cardsDrawn];
    }

    @Override
    public String toString() {
        StringBuilder deckList = new StringBuilder();
        for (Card card : deck) {
            deckList.append(card.toString()).append("\n");
        }
        return deckList + "";
    }
}
