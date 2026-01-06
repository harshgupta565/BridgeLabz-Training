package oopspillars;
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    FoodItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }

    abstract double calculateTotalPrice();

    void getItemDetails() {
        System.out.println(itemName + " | Price: " + price + " | Qty: " + quantity);
    }

    protected double getPrice() {
        return price * quantity;
    }
}

interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {

    VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    double calculateTotalPrice() {
        return getPrice();   // no extra charge
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    public void getDiscountDetails() {
        System.out.println("Veg Item: 10% discount applied");
    }
}

class NonVegItem extends FoodItem {

    NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    double calculateTotalPrice() {
        return getPrice() + 50;  // extra non-veg charge
    }
}

public class FoodDelivery {
    public static void main(String[] args) {

        FoodItem item1 = new VegItem("Paneer Burger", 120, 2);
        FoodItem item2 = new NonVegItem("Chicken Pizza", 250, 1);

        FoodItem[] order = { item1, item2 };

        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println("Total: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                d.getDiscountDetails();
                System.out.println("Discount: " + d.applyDiscount());
            }
            System.out.println();
        }
    }
}
