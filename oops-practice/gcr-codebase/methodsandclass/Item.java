package methodsandclass;
class Item {
    String code, name;
    double price;

    void display() {
        System.out.println("itemCode : " + code);
        System.out.println("itemPrice : " + price);
        System.out.println("itemName : " + name);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Item i1 = new Item();
        i1.code = "01AA";
        i1.name = "Water bottle";
        i1.price = 500;
        i1.display();
    }
}
