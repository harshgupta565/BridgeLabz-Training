package oopsfundamental;

class ProductInventory {
    String productName;
    double price;
    static int totalProducts;

    ProductInventory(String name, double p) {
        productName = name;
        price = p;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println(productName + " - ₹" + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        ProductInventory p1 = new ProductInventory("Laptop", 50000);
        ProductInventory p2 = new ProductInventory("Mouse", 500);

        p1.displayProductDetails();
        p2.displayProductDetails();

        ProductInventory.displayTotalProducts();
    }
}
