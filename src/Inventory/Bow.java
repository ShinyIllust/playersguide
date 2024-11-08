package Inventory;

public final class Bow extends InventoryItem {
    Bow(){
        this.itemWeight = 1;
        this.itemVolume = 4;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
