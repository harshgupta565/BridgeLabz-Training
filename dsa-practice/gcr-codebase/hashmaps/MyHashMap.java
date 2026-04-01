package hashmaps;
import java.util.LinkedList;

class MyHash {
    private static class Node {
        int key, value;
        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private LinkedList<Node>[] buckets;
    private int size;

    MyHash() {
        buckets = new LinkedList[16];
    }

    private int hash(int key) {
        return key % buckets.length;
    }

    void put(int key, int value) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        for (Node node : buckets[index]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }
        buckets[index].add(new Node(key, value));
        size++;
    }

    int get(int key) {
        int index = hash(key);
        if (buckets[index] != null) {
            for (Node node : buckets[index]) {
                if (node.key == key) {
                    return node.value;
                }
            }
        }
        return -1;
    }

    void remove(int key) {
        int index = hash(key);
        if (buckets[index] != null) {
            buckets[index].removeIf(node -> node.key == key);
        }
    }
}

public class MyHashMap {
    public static void main(String[] args) {
        MyHash map = new MyHash();
        map.put(1, 10);
        map.put(2, 20);
        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
    }
}
