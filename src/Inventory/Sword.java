package Inventory;

public final class Sword extends InventoryItem {
    Sword(){
        this.itemWeight = 5;
        this.itemVolume = 3;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
