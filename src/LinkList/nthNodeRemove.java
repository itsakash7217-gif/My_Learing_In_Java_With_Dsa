package LinkList;

import java.util.Scanner;

public class nthNodeRemove {
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
        void print(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp=temp.next;
            }
        }
        void remove(int n){
            Node slow = head;
            Node fast = head;
            for(int i = 0 ; i < n ; i++){
                fast=fast.next;
            }
            if(fast==null){
                head=head.next;
                print();
                return;
            }
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
            print();
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
        System.out.println("this is the origanal linkedlist :-");
        ll.print();
        System.out.println();
        System.out.print("Remove from the last postion Node :");
        int k = sc.nextInt();
        System.out.print("After remove the last nth node at the last from the linkedlist: ");
        ll.remove(k);

    }
}