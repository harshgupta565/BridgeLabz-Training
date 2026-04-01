package oopsfundamental;

class ShoppingCart {

    // static variable (shared by all products)
    static double discount = 0.0;

    // instance variables
    final String productID;     // final variable
    String productName;
    double price;
    int quantity;

    // constructor using this keyword
    ShoppingCart(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // static method to update discount
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // method using instanceof
    void displayDetails(Object obj) {
        if (obj instanceof ShoppingCart) {
            ShoppingCart p = (ShoppingCart) obj;

            double priceAfterDiscount =
                    p.price - (p.price * discount / 100);

            System.out.println("Product ID: " + p.productID);
            System.out.println("Product Name: " + p.productName);
            System.out.println("Price: $" + p.price);
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: $" + priceAfterDiscount);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // set discount for all products
        ShoppingCart.updateDiscount(10.0);

        ShoppingCart p1 = new ShoppingCart("P001", "Laptop", 1200.0, 5);
        ShoppingCart p2 = new ShoppingCart("P002", "Smartphone", 800.0, 10);

        p1.displayDetails(p1);
        p2.displayDetails(p2);
    }
}
