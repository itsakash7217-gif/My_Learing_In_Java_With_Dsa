package LinkList;

import java.util.Scanner;

public class Middleoperation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
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
        Node identifieMidLeft() {
            Node slow = head;
            Node fast = head;
            Node t = slow;
            while (fast.next != null && fast.next.next != null) {
                t  =slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            t.next=slow.next;
            print();
            return slow;
        }
        Node identifieMidRight() {
            Node slow = head;
            Node fast = head;
// 1 2 3 4 5 6
            Node temp = slow;
            while (fast!=null && fast.next!=null) {
                temp = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            temp.next=slow.next;
            print();
            return slow;
        }
        void print(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
        }
    }
    static void main() {
        linkedlist ll = new linkedlist();
        Scanner sc = new Scanner(System.in);
        System.out.print("no. of nodes :");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            ll.add(sc.nextInt());
        }
     //   System.out.println("left mid: "+ ll.identifieMidLeft().data);
        System.out.println("Right Mide: "+ll.identifieMidRight().data);
    }
}
