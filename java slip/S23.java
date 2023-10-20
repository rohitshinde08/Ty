class Item {
    int item_number;
    String item_name;
    double item_price;
    static int objectCount = 0;

    public Item(int item_number, String item_name, double item_price) {
        this.item_number = item_number;
        this.item_name = item_name;
        this.item_price = item_price;
        objectCount++;
    }

    public void displayItem() {
        System.out.println("Item Number: " + item_number);
        System.out.println("Item Name: " + item_name);
        System.out.println("Item Price: $" + item_price);
    }

    public static void displayObjectCount() {
        System.out.println("Number of objects created: " + objectCount);
    }
}

public class S23 {
    public static void main(String[] args) {
        Item item1 = new Item(1, "Item A", 10.99);
        item1.displayItem();
        Item.displayObjectCount();

        Item item2 = new Item(2, "Item B", 15.49);
        item2.displayItem();
        Item.displayObjectCount();
    }
}