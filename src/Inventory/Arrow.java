package Inventory;

public final class Arrow extends InventoryItem {
    Arrow(){
        this.itemWeight = 0.1;
        this.itemVolume = 0.05;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
