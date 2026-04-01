class CarNode {
    String car;
    CarNode next;

    CarNode(String car) {
        this.car = car;
        this.next = null;
    }
}

class Roundabout {
    CarNode last;

    void addCar(String car) {
        CarNode newCar = new CarNode(car);

        if (last == null) {
            last = newCar;
            last.next = last;
        } else {
            newCar.next = last.next;
            last.next = newCar;
            last = newCar;
        }

        System.out.println(car + " entered");
    }

    void removeCar() {
        if (last == null) {
            System.out.println("No car in roundabout");
            return;
        }

        CarNode first = last.next;

        if (first == last) {
            System.out.println(first.car + " exited");
            last = null;
        } else {
            System.out.println(first.car + " exited");
            last.next = first.next;
        }
    }

    void showCars() {
        if (last == null) {
            System.out.println("Roundabout empty");
            return;
        }

        CarNode temp = last.next;

        do {
            System.out.print(temp.car + " ");
            temp = temp.next;
        } while (temp != last.next);

        System.out.println();
    }
}

class WaitingQueue {
    String[] cars;
    int front;
    int rear;
    int count;

    WaitingQueue(int size) {
        cars = new String[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    void add(String car) {
        if (count == cars.length) {
            System.out.println("Queue full");
            return;
        }

        rear++;
        cars[rear] = car;
        count++;

        System.out.println(car + " waiting");
    }

    String remove() {
        if (count == 0) {
            System.out.println("Queue empty");
            return null;
        }

        String car = cars[front];
        front++;
        count--;

        return car;
    }
}

public class TrafficManager {
    public static void main(String[] args) {

        Roundabout r = new Roundabout();
        WaitingQueue q = new WaitingQueue(3);

        q.add("Car1");
        q.add("Car2");
        q.add("Car3");
        q.add("Car4");

        String c;

        c = q.remove();
        if (c != null) r.addCar(c);

        c = q.remove();
        if (c != null) r.addCar(c);

        r.showCars();

        r.removeCar();
        r.showCars();

        c = q.remove();
        if (c != null) r.addCar(c);

        r.showCars();
    }
}
