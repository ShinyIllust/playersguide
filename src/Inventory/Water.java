package Inventory;

public class Water extends InventoryItem {
    protected Water(){
        this.itemWeight = 2;
        this.itemVolume = 3;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
