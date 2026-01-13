interface AlertService{
    void sendLowStockAlert(Product product);
}
class OutofStockException extends Exception{
    public OutofStockException(String message){
        super(message);
    }
}
class Alertdetails implements AlertService{

    @Override
    public void sendLowStockAlert(Product product) {
        System.out.println("⚠ Low Stock Alert: "
                + product.productName
                + " | Qty: "
                + product.quantity);
    }
}
class Product{
    int productId;
    String productName;
    int quantity;
    Product(int productId ,String productName , int quantity){
        this.productId=productId;
        this.productName=productName;
        this.quantity =quantity;
    }
}
class Inventory{
    void addProduct(Product product){
    }
    void updateStock(int productId , int quantity) throws OutofStockException{

    }
}
public class InventatoryManagement {
    public static void main(String[] args) {

    }
}
