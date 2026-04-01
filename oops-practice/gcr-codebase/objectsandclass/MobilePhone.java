package objectsandclass;
class MobilePhone {
    String brand, model;
    double price;

    void display() {
        System.out.println("Brand of mobile: " + brand);
        System.out.println("Model of mobile: " + model);
        System.out.println("Price of mobile: " + price);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        m.brand = "VIVO";
        m.model = "VIVO V29";
        m.price = 15999;
        m.display();
    }
}
