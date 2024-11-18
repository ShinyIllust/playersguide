package Swords;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Materials[] materials = Materials.values();
        Gemstones[] gemstones = Gemstones.values();
        String material;
        String gemstone;
        int length;
        int width;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Material:");
        System.out.println(Arrays.toString(Materials.values()));
        material = scanner.nextLine().toUpperCase();

        System.out.println("Select Gemstone:");
        System.out.println(Arrays.toString(Gemstones.values()));
        gemstone = scanner.nextLine().toUpperCase();

        System.out.println("Select Length");
        length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Select Width");
        width = scanner.nextInt();
        scanner.nextLine();

        Sword sword = new Sword(material, gemstone, length, width);
        System.out.println(sword);
        System.out.println(new Sword());

    }
}
