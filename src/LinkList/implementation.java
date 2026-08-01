package LinkList;

public class implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist {
        Node head;
        Node tail;
        int size = 0;
        void insertAtEnd(int a) {
            Node temp = new Node(a);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void insertAtStart(int b) {
            Node temp = new Node(b);
            if (head == null) {
                insertAtEnd(b);
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAtAnywhere(int ind, int x) {
            if (ind == size) {
                insertAtEnd(x);
                return;
            } else if (ind == 0) {
                insertAtStart(x);
                return;
            } else if (ind < 0 || ind > size) {
                System.out.println("Wronf index");
                return;
            }
            Node temp = new Node(x);
            Node a = head;
            for (int i = 1; i <= ind - 1; i++) {
                a = a.next;
            }
            temp.next = a.next;
            a.next = temp;
            size++;
        }

        void delete(int ind) {
            Node temp = head;
            for (int i = 1; i <= ind - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
        int getat(int ind) {
            if (ind < 0 || ind > size) {
                System.out.println("Wronf index");
                return -1;
            }
            Node temp = head;
            for (int i = 1; i <= ind; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
         Node reverse(){
            Node pre = null;
            Node current = head;
            tail=head;
            while(current!=null) {
                Node nex = current.next;
                current.next = pre;
                pre = current;
                current = nex;
            }
            head=pre;
             return head;
        }
    }
    static void main() {
        linkedlist ll = new linkedlist();

        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.display();
        ll.insertAtStart(-1);
        ll.insertAtStart(-2);
        ll.insertAtStart(-3);
        ll.insertAtStart(-4);

        ll.display();

        System.out.println("linkedlist size: "+ll.size);

        ll.insertAtAnywhere(4,0);

        ll.display();

        System.out.println("linkedlist size: "+ll.size);

        ll.delete(4);

        System.out.print("after deletion of index value :");
        ll.display();
        System.out.println("linkedlist size: "+ll.size);
        System.out.println("Element of the Index: "+ll.getat(10));
        linkedlist a = ll;
        ll.reverse();
        ll.display();
    }
}
