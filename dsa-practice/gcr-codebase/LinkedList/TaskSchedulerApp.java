package LinkedList;
class TaskNode {
    int id, priority;
    String name, dueDate;
    TaskNode next;

    TaskNode(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        next = this;
    }
}

class TaskScheduler {
    TaskNode head, current;

    // Add at beginning
    void addAtBeginning(int id, String name, int p, String d) {
        TaskNode n = new TaskNode(id, name, p, d);
        if (head == null) {
            head = current = n;
            return;
        }
        TaskNode t = head;
        while (t.next != head) t = t.next;
        n.next = head;
        t.next = n;
        head = n;
    }

    // Add at end
    void addAtEnd(int id, String name, int p, String d) {
        if (head == null) {
            addAtBeginning(id, name, p, d);
            return;
        }
        TaskNode n = new TaskNode(id, name, p, d);
        TaskNode t = head;
        while (t.next != head) t = t.next;
        t.next = n;
        n.next = head;
    }

    // Add at position (1-based)
    void addAtPosition(int pos, int id, String name, int p, String d) {
        if (pos == 1) {
            addAtBeginning(id, name, p, d);
            return;
        }
        TaskNode t = head;
        for (int i = 1; i < pos - 1 && t.next != head; i++)
            t = t.next;

        TaskNode n = new TaskNode(id, name, p, d);
        n.next = t.next;
        t.next = n;
    }

    // Remove by Task ID
    void removeById(int id) {
        if (head == null) return;

        TaskNode t = head, prev = null;
        do {
            if (t.id == id) {
                if (t == head) {
                    TaskNode last = head;
                    while (last.next != head) last = last.next;
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = t.next;
                }
                System.out.println("Task removed");
                return;
            }
            prev = t;
            t = t.next;
        } while (t != head);

        System.out.println("Task not found");
    }

    // View current task & move next
    void viewNextTask() {
        if (current == null) return;
        print(current);
        current = current.next;
    }

    // Display all tasks
    void display() {
        if (head == null) return;
        TaskNode t = head;
        do {
            print(t);
            t = t.next;
        } while (t != head);
    }

    // Search by priority
    void searchByPriority(int p) {
        if (head == null) return;
        TaskNode t = head;
        do {
            if (t.priority == p) print(t);
            t = t.next;
        } while (t != head);
    }

    void print(TaskNode t) {
        System.out.println("ID:" + t.id + " Name:" + t.name +
                " Priority:" + t.priority + " Due:" + t.dueDate);
    }
}

public class TaskSchedulerApp {
    public static void main(String[] args) {

        TaskScheduler ts = new TaskScheduler();

        ts.addAtBeginning(1, "Coding", 1, "10-Jan");
        ts.addAtEnd(2, "Testing", 2, "12-Jan");
        ts.addAtPosition(2, 3, "Review", 1, "11-Jan");

        System.out.println("All Tasks:");
        ts.display();

        System.out.println("\nCurrent & Next Task:");
        ts.viewNextTask();
        ts.viewNextTask();

        System.out.println("\nPriority 1 Tasks:");
        ts.searchByPriority(1);

        ts.removeById(2);
        System.out.println("\nAfter Removal:");
        ts.display();
    }
}
