package Inventory;

public class Pack {
    int maxItems;
    double maxWeight;
    double maxVolume;
    double currentWeight;
    double currentVolume;
    InventoryItem[] content;

    public Pack(int maxItems, double maxWeight, double maxVolume) {
        this.maxItems = maxItems;
        this.maxWeight = maxWeight;
        this.maxVolume = maxVolume;
        this.currentWeight = 0;
        this.currentVolume = 0;
        InventoryItem[] content = new InventoryItem[maxItems];
        this.content = content;
        for (InventoryItem inventoryItem : content) {
            if (inventoryItem != null) {
                this.currentWeight = currentWeight + inventoryItem.itemWeight;
                this.currentVolume = currentVolume + inventoryItem.itemVolume;
            }
        }
    }

    public boolean add(InventoryItem item) {
        if ((item.itemWeight + Pack.this.currentWeight) <= Pack.this.maxWeight && (item.itemVolume + Pack.this.currentVolume) <= Pack.this.maxVolume) {
            for(int i = 0; i < content.length; i++){
                if (content[i] == null){
                    content[i] = item;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String packStatus;
        StringBuilder packContent = new StringBuilder();
        packStatus = "The pack contains:";
        for (InventoryItem inventoryItem : content) {
            if (inventoryItem != null) {
                packContent.append(" ").append(inventoryItem);
            } else {
                packStatus = "The pack is empty.";
            }
        }
        return packStatus + packContent;
    }
}