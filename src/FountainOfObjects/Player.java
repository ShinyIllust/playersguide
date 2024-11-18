package FountainOfObjects;

public class Player {
    int x;
    int y;
    int worldSize;
    boolean hasEnabledFountain = false;

    Player(int x, int y, int worldSize){
        this.x = x;
        this.y = y;
        this.worldSize = worldSize;
    }

    boolean goNorth(){
        if(y < worldSize){
            y++;
            return true;
        } else {
            return false;
        }
    }

    boolean goSouth(){
        if(y > 0){
            y--;
            return true;
        } else {
            return false;
        }
    }

    boolean goEast(){
        if(x < worldSize){
            x++;
            return true;
        } else {
            return false;
        }
    }

    boolean goWest(){
        if(x > 0){
            x--;
            return true;
        } else {
            return false;
        }
    }
}
