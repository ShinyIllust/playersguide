package Inventory;

public class Rope extends InventoryItem {
    protected Rope(){
        this.itemWeight = 1;
        this.itemVolume = 1.5;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
