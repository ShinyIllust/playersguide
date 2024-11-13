package Coords41;

public record Coordinate(int row, int column) {
    boolean isAdjacent(int rowOther, int columnOther){
        if(row + 1 == rowOther || row - 1 == rowOther){
            return column + 1 != columnOther && column - 1 != columnOther;
        } else {
            if (column + 1 == columnOther || column - 1 == columnOther){
                return row + 1 != rowOther && row - 1 != rowOther;
            } else {
                return false;
            }
        }
    }
}
