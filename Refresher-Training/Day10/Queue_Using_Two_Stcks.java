package Day10;
import java.io.*;
import java.util.*;
public class Queue_Using_Two_Stcks{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */



        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (q-- > 0) {

            int type = sc.nextInt();

            if (type == 1) {
                // Enqueue
                int x = sc.nextInt();
                stack1.push(x);

            } else if (type == 2) {
                // Dequeue
                moveElements(stack1, stack2);

                stack2.pop();

            } else if (type == 3) {
                // Print front
                moveElements(stack1, stack2);

                System.out.println(stack2.peek());
            }
        }

        sc.close();
    }

    static void moveElements(Stack<Integer> stack1, Stack<Integer> stack2) {

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
}

