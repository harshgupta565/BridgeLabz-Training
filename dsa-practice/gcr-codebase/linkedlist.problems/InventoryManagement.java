package linkedlist.problems;

class ItemNode {
    int id, qty;
    String name;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        next = null;
    }
}

class InventoryList {
    ItemNode head;

    // Add at beginning
    void addAtBeginning(int id, String n, int q, double p) {
        ItemNode node = new ItemNode(id, n, q, p);
        node.next = head;
        head = node;
    }

    // Add at end
    void addAtEnd(int id, String n, int q, double p) {
        ItemNode node = new ItemNode(id, n, q, p);
        if (head == null) { head = node; return; }
        ItemNode t = head;
        while (t.next != null) t = t.next;
        t.next = node;
    }

    // Add at position
    void addAtPosition(int pos, int id, String n, int q, double p) {
        if (pos == 1) { addAtBeginning(id, n, q, p); return; }
        ItemNode t = head;
        for (int i = 1; i < pos - 1 && t != null; i++) t = t.next;
        if (t == null) return;
        ItemNode node = new ItemNode(id, n, q, p);
        node.next = t.next;
        t.next = node;
    }

    // Remove by ID
    void removeById(int id) {
        if (head == null) return;
        if (head.id == id) { head = head.next; return; }
        ItemNode t = head;
        while (t.next != null && t.next.id != id) t = t.next;
        if (t.next != null) t.next = t.next.next;
    }

    // Update quantity
    void updateQty(int id, int newQty) {
        ItemNode t = head;
        while (t != null) {
            if (t.id == id) { t.qty = newQty; return; }
            t = t.next;
        }
    }

    // Search by ID or Name
    void search(int id, String name) {
        ItemNode t = head;
        while (t != null) {
            if (t.id == id || t.name.equalsIgnoreCase(name))
                print(t);
            t=t.next;
        }
    }

    // Total inventory value
    void totalValue() {
        double sum = 0;
        ItemNode t = head;
        while (t != null) {
            sum += t.qty * t.price;
            t = t.next;
        }
        System.out.println("Total Inventory Value: " + sum);
    }

    // Sort by name or price
    void sort(boolean byName, boolean asc) {
        for (ItemNode i = head; i != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {
                boolean cond = byName ?
                        (asc ? i.name.compareTo(j.name) > 0 : i.name.compareTo(j.name) < 0)
                        : (asc ? i.price > j.price : i.price < j.price);
                if (cond) swap(i, j);
            }
        }
    }

    void swap(ItemNode a, ItemNode b) {
        int id = a.id, qty = a.qty;
        double price = a.price;
        String name = a.name;

        a.id = b.id; a.qty = b.qty; a.price = b.price; a.name = b.name;
        b.id = id;   b.qty = qty;   b.price = price;   b.name = name;
    }

    void display() {
        ItemNode t = head;
        while (t != null) {
            print(t);
            t = t.next;
        }
    }

    void print(ItemNode i) {
        System.out.println("ID:" + i.id + " Name:" + i.name +
                " Qty:" + i.qty + " Price:" + i.price);
    }
}

public class InventoryManagement {
    public static void main(String[] args) {

        InventoryList inv = new InventoryList();

        inv.addAtBeginning(1, "Laptop", 5, 50000);
        inv.addAtEnd(2, "Mouse", 20, 500);
        inv.addAtPosition(2, 3, "Keyboard", 10, 1500);

        inv.display();
        inv.updateQty(2, 25);

        System.out.println("\nSearch:");
        inv.search(3, "");

        inv.totalValue();

        System.out.println("\nSorted by Price DESC:");
        inv.sort(false, false);
        inv.display();
    }
}

