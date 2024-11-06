package Fletcher;

import java.util.Scanner;

import static Fletcher.Arrow.*;

public class Fletcher {

    public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);

        String[] arrowtypes = {"ELITE", "BEGINNER", "MARKSMAN", "CUSTOM"};
        String arrowtype;

        //Ask user to pick arrow type
        System.out.println("Select arrow type:");
        for (String i : arrowtypes) {
            System.out.println(i);
        }
        arrowtype = scanned.nextLine();
        arrowtype = arrowtype.toUpperCase();

        Arrow arrow = createArrow(arrowtype);

        System.out.println(arrow.cost);
    }
}
