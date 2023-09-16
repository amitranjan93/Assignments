import java.util.*;

public class ll_Assg2 {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void insertAtMiddle(int pointer, int value) {
        Node n = new Node(value);
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        // Node prev=null;
        Node curr = head;
        // Node next=null;
        int i = 0;
        while (i < pointer - 1) {
            curr = curr.next;
            i++;
        }
        n.next = curr.next;
        curr.next = n;
    }

    public static boolean search(Node head, int x) {

        Node curr = head;
        while (curr != null) {
            if (x == curr.data) {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    public static void display(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        head = n1;
        insertAtMiddle(2, 3);
        display(head);
    }
}
