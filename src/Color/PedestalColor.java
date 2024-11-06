package Color;

import java.util.Scanner;

public class PedestalColor {
    public static void main(String[] args){
        String[] colors = {"White", "Black", "Red", "Orange", "Yellow", "Green", "Blue", "Purple"};
        String color = null;
        Scanner scanned = new Scanner(System.in);
        String selectedColor;
        String colorName = null;
        String newColor = null;
        int red = 0;
        int green = 0;
        int blue = 0;

        System.out.println("Select Color:");
        for (String s : colors) {
            System.out.println(s);
        }
        selectedColor = scanned.nextLine();
        switch(selectedColor){
            case "White":
                color = Color.constructWhite().toString();
                break;
            case "Black":
                color = Color.constructBlack().toString();
                break;
            case "Red":
                color = Color.constructRed().toString();
                break;
            case "Orange":
                color = Color.constructOrange().toString();
                break;
            case "Yellow":
                color = Color.constructYellow().toString();
                break;
            case "Green":
                color = Color.constructGreen().toString();
                break;
            case "Blue":
                color = Color.constructBlue().toString();
                break;
            case "Purple":
                color = Color.constructPurple().toString();
                break;
            default:
                System.out.println("Unknown Color.");
                System.out.println("Submit Color Name");
                colorName = scanned.nextLine();
                System.out.println("Submit Red Value");
                red = scanned.nextInt();
                System.out.println("Submit Green Value");
                green = scanned.nextInt();
                System.out.println("Submit Blue Value");
                blue = scanned.nextInt();

                newColor = new Color(colorName, red, green, blue).toString();
                break;
        }
        if(color != null){
            System.out.println(color);
        } else {
            System.out.println(newColor);
        }
    }
}
