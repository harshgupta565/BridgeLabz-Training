package Day3;

import java.util.Scanner;

public class Height_of_Binary_Tree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int value) {
            data = value;
        }
    }

    public static int height(Node root) {

        if (root == null) {
            return -1;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    public static Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value <= root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node root = null;

        while (n-- > 0) {
            root = insert(root, sc.nextInt());
        }

        System.out.println(height(root));

        sc.close();
    }
}