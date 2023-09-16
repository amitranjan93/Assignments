import java.util.*;

public class ll_Assg4 {

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

    public static boolean checkPalindrome(Node head) {

        List<Integer> l1 = new ArrayList<Integer>();
        Node temp = head;
        while (temp != null) {
            l1.add(temp.data);
            temp = temp.next;
        }
        int j = 0;
        int k = l1.size() - 1;
        int flag = 0;
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(j).equals(l1.get(k))) {
                j++;
                k--;
                flag = 1;
            } else {
                return false;
            }
        }
        if (flag == 1) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        head = n1;
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(2);
        n2.next = n3;
        Node n4 = new Node(1);
        n3.next = n4;

        display(head);
        System.out.println("Is LinkedList palindrome? " + checkPalindrome(head));

    }
}
