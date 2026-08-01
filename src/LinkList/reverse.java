package LinkList;

import java.util.LinkedList;
import java.util.Scanner;

public class reverse {
    public reverse(LinkedList ll) {
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void add(int a){
            Node temp = new Node(a);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;

            }
            tail=temp;

        }
        void print(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
        }

    }
    public static Node reverse(Node head){
        if(head.next==null){
            return head;
        }
        Node newHead = reverse(head.next);
        head.next.next=head;
        return newHead;
    }
    static void main() {
        linkedlist ll = new linkedlist();
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of nodes :");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            ll.add(sc.nextInt());
        }
        Node newhead = reverse(ll.head);

    }
}
