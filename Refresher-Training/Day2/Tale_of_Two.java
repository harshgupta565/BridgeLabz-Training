package Day2;

import java.util.Scanner;
import java.util.Stack;

public class Tale_of_Two {

    static class MyQueue<T> {

        private Stack<T> first = new Stack<>();
        private Stack<T> second = new Stack<>();

        public void enqueue(T value) {
            first.push(value);
        }

        public void dequeue() {
            prepare();
            second.pop();
        }

        public T peek() {
            prepare();
            return second.peek();
        }

        private void prepare() {
            if (second.isEmpty()) {
                while (!first.isEmpty()) {
                    second.push(first.pop());
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyQueue<Integer> queue = new MyQueue<>();

        int queries = sc.nextInt();

        while (queries-- > 0) {

            int type = sc.nextInt();

            switch (type) {
                case 1:
                    queue.enqueue(sc.nextInt());
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    System.out.println(queue.peek());
                    break;
            }
        }

        sc.close();
    }
}