package Coords41;

public class Main {
    public static void main(String[] args){
        Coordinate room1 = new Coordinate(0,0);
        Coordinate room2 = new Coordinate(1, 0);
        Coordinate room3 = new Coordinate(2, 0);
        System.out.println(room1.isAdjacent(room3.row(), room3.column()));
    }
}