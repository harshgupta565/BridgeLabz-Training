package oopspillars;

// Interface
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class
abstract class Product {
    int productId;
    String name;
    double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // abstract method
    abstract void calculateDiscount(int percentage);
}

// Child class
class Electronics extends Product implements Taxable {

    private String productCategory;
    private double discountAmount;

    Electronics(int productId, String name, double price, String productCategory) {
        super(productId, name, price);
        this.productCategory = productCategory;
    }

    // Implement abstract method
    @Override
    void calculateDiscount(int percentage) {
        discountAmount = price * percentage / 100;
        price = price - discountAmount;
    }

    // Implement interface methods
    @Override
    public double calculateTax() {
        return price * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "18% GST applied on Electronics";
    }

    void displayProduct() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Category   : " + productCategory);
        System.out.println("Price      : " + price);
        System.out.println("Tax        : " + calculateTax());
        System.out.println(getTaxDetails());
    }
}

// Main class
public class EcommercePlatform {
    public static void main(String[] args) {

        Electronics e1 = new Electronics(101, "Cooler", 565.0, "Home Appliance");

        e1.calculateDiscount(10); // 10% discount
        e1.displayProduct();
    }
}
