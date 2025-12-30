package methodsandclass;
class CartItem {
    String name = "Laptop";
    double price = 999.99;
    int quantity = 1;

    void add(int q) {
        quantity += q;
        System.out.println("Added " + q + " of Laptop to the cart.");
    }

    void remove(int q) {
        quantity -= q;
        System.out.println("Removed " + q + " of Laptop from the cart.");
    }

    void total() {
        System.out.println("Total cost: $" + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.add(2);
        c.remove(1);
        c.total();
    }
}
