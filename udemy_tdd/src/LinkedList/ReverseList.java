package LinkedList;

public class ReverseList {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(null);

        Node head = n1;
        Node prev = null;
        Node cur = head;
        Node oriNext;

        while (cur != null) {
            oriNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = oriNext;
        }
        head = prev;

        while (head != null) {
            System.out.print(head.val);
            System.out.print(" ");
            head = head.next;
        }

    }
}
