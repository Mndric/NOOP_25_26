package pckg_VJ_Z1;

public class Item {

    private String itemName;
    private String itemCat;

    public  Item(String itemName, String itemCat) {
        this.itemName = itemName;
        this.itemCat = itemCat;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Category: " + itemCat;
    }
    public String getItemName() {
        return itemName;
    }
    public String getItemCat() {
        return itemCat;
    }
}
