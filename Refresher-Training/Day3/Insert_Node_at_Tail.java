package Day3;

import java.util.Scanner;

public class Insert_Node_at_Tail {

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        SinglyLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null) {
            return newNode;
        }

        SinglyLinkedListNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        return head;
    }

    static void printList(SinglyLinkedListNode head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        SinglyLinkedListNode head = null;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head = insertNodeAtTail(head, value);
        }

        printList(head);

        sc.close();
    }
}