package Inventory;

public class Sword extends InventoryItem {
    public Sword(){
        this.itemWeight = 5;
        this.itemVolume = 3;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
