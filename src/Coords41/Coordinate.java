package Coords41;

public record Coordinate(int row, int column) {
    boolean isAdjacent(int rowOther, int columnOther){
        if(row + 1 == rowOther || row - 1 == rowOther){
            if(column == columnOther || column == columnOther + 1 || column == columnOther - 1){
                return true;
            }
        }
        if(column + 1 == columnOther || column - 1 == columnOther){
            if(row == rowOther || row == rowOther + 1 || row == rowOther - 1){
                return true;
            }
        }
        return false;
    }
}
