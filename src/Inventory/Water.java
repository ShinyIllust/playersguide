package Inventory;

public final class Water extends InventoryItem {
    Water(){
        this.itemWeight = 2;
        this.itemVolume = 3;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
