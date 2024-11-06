package Fletcher;

public enum Material {
    STEEL(10),
    WOOD(3),
    OBSIDIAN(5),
    PLASTIC(10),
    TURKEY(5),
    GOOSE(3);

    int cost;

    Material(int cost){
        this.cost = cost;
    }
}
