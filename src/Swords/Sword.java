package Swords;

import java.util.Objects;

public class Sword {
    String material;
    String gemstone;
    int length;
    int width;

    public Sword() {
        this.material = "IRON";
        this.gemstone = "NONE";
        this.length = 80;
        this.width = 15;
    }

    public Sword(String material, String gemstone, int length, int width) {
        this.material = material;
        this.gemstone = gemstone;
        this.length = length;
        this.width = width;
    }

    public String toString(){
        String flavor;
        if(Objects.equals(gemstone, "NONE")){
            flavor = "no gemstone.";
        } else {
            flavor = "a " + gemstone + " gemstone";
        }
        return "a " + material + " sword of " + length + " cm long, a crossguard width of " + width +  " cm, and " + flavor;
    }
}
