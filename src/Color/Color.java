package Color;

public class Color {
    String colorName;
    int red;
    int green;
    int blue;

    Color(String colorName, int red, int green, int blue){
        this.colorName = colorName;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public static Color constructWhite(){
        Color c1;
        c1 = new Color("White", 255, 255, 255);
        return c1;
    }

    public static Color constructBlack(){
        Color c1;
        c1 = new Color("Black", 0, 0, 0);
        return c1;
    }

    public static Color constructRed(){
        Color c1;
        c1 = new Color("Red", 255, 0, 0);
        return c1;
    }

    public static Color constructOrange(){
        Color c1;
        c1 = new Color("Orange", 255, 162, 0);
        return c1;
    }

    public static Color constructYellow(){
        Color c1;
        c1 = new Color("Yellow", 255, 255, 0);
        return c1;
    }

    public static Color constructGreen(){
        Color c1;
        c1 = new Color("Green", 0, 128, 0);
        return c1;
    }

    public static Color constructBlue(){
        Color c1;
        c1 = new Color("Blue", 0, 0, 255);
        return c1;
    }

    public static Color constructPurple(){
        Color c1;
        c1 = new Color("Purple", 128, 0, 128);
        return c1;
    }

    public String toString(){
        return colorName + ": (" + red + "," + green + "," + blue + ")";
    }
}
