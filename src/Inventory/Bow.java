package Inventory;

public class Bow extends InventoryItem {
    public Bow(){
        this.itemWeight = 1;
        this.itemVolume = 4;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}