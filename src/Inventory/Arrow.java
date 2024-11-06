package Inventory;

public class Arrow extends InventoryItem {
    public Arrow(){
        this.itemWeight = 0.1;
        this.itemVolume = 0.05;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
