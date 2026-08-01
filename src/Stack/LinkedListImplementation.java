package Stack;

public class LinkedListImplementation {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public class  stack{
        Node head;

        int size  = 0 ;
        void Push(int a){
            Node ll = new Node(a);
         if(head==null) {
             head = ll;
         }else{
             Node x =head;
             head = ll;
             head.next = x;

         }
         size++;
        }
        int Peek(){
            if(head==null) return -1;
            return head.data;
        }
        int pop(){
            if(head==null) return -1;
            int a = head.data;
            head=head.next;
            size--;
            return a;
        }
        void print(){
            display(head);
           // System.out.print();
        }
        void display(Node head){
            if(head==null) return;
            display(head.next);
            System.out.println(head.data);
        }
    }
    void main() {
        stack st = new stack();
        st.Push(1);
        st.Push(2);
        st.Push(3);
        st.Push(4);
        st.Push(5);
        st.Push(6);
        System.out.println(st.Peek() +" ");
        st.print();
        System.out.println();
        System.out.println("Size of the stack");
        System.out.println(st.size);
        System.out.println(st.pop());
        st.print();

        System.out.println();
        System.out.println("Size of the stack");
        System.out.println(st.size);

    }
}
