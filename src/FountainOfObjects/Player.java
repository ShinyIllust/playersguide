package FountainOfObjects;

public class Player {
    int x;
    int y;
    int worldSize;
    boolean hasEnabledFountain = false;
    int arrows = 5;

    Player(int x, int y, int worldSize){
        this.x = x;
        this.y = y;
        this.worldSize = worldSize;
    }

    boolean goNorth(){
        if(y < worldSize - 1){
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
        if(x < worldSize - 1){
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

    boolean shootNorth(){
        if(y < worldSize - 1 && arrows > 0){
            arrows--;
            return true;
        } else {
            return false;
        }
    }
    boolean shootSouth(){
        if(y > 0 && arrows > 0){
            arrows--;
            return true;
        } else {
            return false;
        }
    }
    boolean shootWest(){
        if(x > 0 && arrows > 0){
            arrows--;
            return true;
        } else {
            return false;
        }
    }
    boolean shootEast(){
        if(x < worldSize - 1 && arrows > 0){
            arrows--;
            return true;
        } else {
            return false;
        }
    }
}
