package Day2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Maximum_Element {

    public static List<Integer> getMax(List<String> operations) {

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> maxStack = new ArrayDeque<>();

        List<Integer> result = new ArrayList<>();

        for (String operation : operations) {

            String[] data = operation.split(" ");
            int choice = Integer.parseInt(data[0]);

            switch (choice) {

                case 1:
                    int value = Integer.parseInt(data[1]);
                    stack.push(value);

                    if (maxStack.isEmpty() || value >= maxStack.peek()) {
                        maxStack.push(value);
                    }
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        int removed = stack.pop();

                        if (!maxStack.isEmpty() && removed == maxStack.peek()) {
                            maxStack.pop();
                        }
                    }
                    break;

                case 3:
                    if (!maxStack.isEmpty()) {
                        result.add(maxStack.peek());
                    }
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<String> operations = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            operations.add(sc.nextLine());
        }

        List<Integer> answer = getMax(operations);

        for (int num : answer) {
            System.out.println(num);
        }

        sc.close();
    }
}