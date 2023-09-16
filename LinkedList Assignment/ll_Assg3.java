public class ll_Assg3 {

    static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void deleteDuplicate(Node head) {
        int i;
        Node prev = head;
        Node curr = head.next;
        ;
        while (curr != null) {
            i = prev.data;
            if (i == curr.data) {
                prev.next = curr.next;
                curr = prev.next;
            } else {
                curr = curr.next;
                prev = prev.next;
            }
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        head = n1;
        Node n2 = new Node(1);
        n1.next = n2;
        Node n3 = new Node(2);
        n2.next = n3;
        Node n4 = new Node(3);
        n3.next = n4;
        Node n5 = new Node(3);
        n4.next = n5;
        display(head);
        deleteDuplicate(head);
        display(head);
    }
}
