package LinkList;

public class FirstTry {
    public static void print(Node a){
        if(a==null) return ;
        System.out.print(a.data+" ");
        print(a.next);
    }
    public static void print1(Node a){
        while(a!=null){
            System.out.print(a.data+" ");
            a=a.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    static void main() {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;

        Node temp=a;
        print1(a);
        print(temp);
        //System.out.println(print);
//        Node temp = a;
//        while(temp != null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }

//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);

    }
}
