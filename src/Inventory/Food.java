package Inventory;

public class Food extends InventoryItem {
    protected Food(){
        this.itemWeight = 1;
        this.itemVolume = 0.5;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
