package Point;

public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static Point constructPoint(){
        Point p1;
        p1 = new Point(0,0);
        return p1;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}