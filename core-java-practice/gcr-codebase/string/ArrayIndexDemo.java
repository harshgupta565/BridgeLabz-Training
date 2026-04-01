package string;

public class ArrayIndexDemo {

    static void generate() {
        String[] names = {"A", "B"};
        System.out.println(names[5]);
    }

    static void handle() {
        try {
            String[] names = {"A", "B"};
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        // generate();
        handle();
    }
}
