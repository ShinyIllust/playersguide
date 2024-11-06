package Cards;

public enum CardColor {
    RED(1),
    GREEN(2),
    BLUE(3),
    YELLOW(4);

    int color;
    CardColor(int color){
        this.color = color;
    }
}
