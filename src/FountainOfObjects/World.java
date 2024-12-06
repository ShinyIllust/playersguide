package FountainOfObjects;

public class World {
    int size;
    Room[][] rooms;

    World(int size){
        this.size = size;
        rooms = new Room[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                rooms[i][j] = new Room(i, j);
            }
        }

        createEntrance();
        createFountain();
        createPit();
        createAmarok();
    }

    void createEntrance(){
        rooms[0][0].feature = 1;
    }

    void createFountain(){
        switch (size){
            case 4:
                rooms[2][0].feature = 2;
                break;
            case 6:
                rooms[3][4].feature = 2;
                break;
            case 8:
                rooms[5][6].feature = 2;;
                break;
        }
    }

    void createPit(){
        switch (size){
            case 4:
                rooms[2][3].feature = 4;
                break;
            case 6:
                rooms[4][4].feature = 4;
                rooms[2][1].feature = 4;
                break;
            case 8:
                rooms[4][5].feature = 4;
                rooms[1][5].feature = 4;
                rooms[3][4].feature = 4;
                break;
        }
    }
    void createAmarok(){
        switch (size){
            case 4:
                rooms[1][2].feature = 6;
                break;
            case 6:
                rooms[1][4].feature = 6;
                rooms[4][0].feature = 6;
                break;
            case 8:
                rooms[1][7].feature = 6;
                rooms[5][3].feature = 6;
                rooms[4][5].feature = 6;
                break;
        }
    }
}
