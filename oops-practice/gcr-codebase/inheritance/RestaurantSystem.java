package inheritance;

// Interface for work-related behaviour
interface Worker {
    void performDuties();
}

// Parent class
class PersonNew {
    String name;
    int id;

    PersonNew(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Chef class
class Chef extends PersonNew implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious food.");
    }
}

// Waiter class
class Waiter extends PersonNew implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving food to customers.");
    }
}

// Main class
public class RestaurantSystem {
    public static void main(String[] args) {

        Chef chef = new Chef("Harsh", 101);
        Waiter waiter = new Waiter("Amit", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}

