package FountainOfObjects;

public class Room {
    int x;
    int y;
    int feature;

    Room(int x, int y){
        this.x = x;
        this.y = y;
    }

    String announce(){
        return switch (feature) {
            case 1 -> "You see light coming from the cavern entrance...";
            case 2 -> "You hear water dripping in this room. The Fountain of Objects is here!";
            case 3 -> "You hear the rushing waters from the Fountain of Objects. It has been reactivated!";
            case 4 -> "You fall into a pit!";
            case 5 -> "You run into a maelstrom!";
            case 6 -> "You run into an amarok!";
            default -> "The room seems empty...";
        };
    }

    String announceAdjacent(){
        return switch (feature) {
            case 4 -> "You feel a draft. There is a pit in a nearby room.";
            case 5 -> "You hear the growling and groaning of a maelstrom nearby.";
            case 6 -> "You can smell the rotten stench of an amarok in a nearby room.";
            default -> "";
        };
    }

    void checkDanger(){
        switch (feature) {
            case 4, 6 -> {
                System.out.println("You Died!");
            }
            default -> {}
        }
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")\n";
    }
}
