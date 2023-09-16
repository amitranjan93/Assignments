import java.util.*;

public class ll_Assg1 {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
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

        Node n1 = new Node(14);
        Node n2 = new Node(21);
        Node n3 = new Node(11);
        Node n4 = new Node(30);
        Node n5 = new Node(10);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;
        head = n1;
        // display(head);
        System.out.print("Enter the value you want to search:");
        int x = sc.nextInt();
        System.out.println(x + " is present in LinkedList? :" + search(head, x));
        sc.close();
    }
}
