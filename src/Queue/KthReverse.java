package Queue;
import java.util.*;
public class KthReverse {
    static void rotate(Queue<Integer> q,int r){
        Stack<Integer> st =new Stack<>();
        for(int i = 0 ; i < r ; i++ ){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
    }
    static void reverse(Queue<Integer> q,int r){
        Stack<Integer> st =new Stack<>();
        for(int i = 0 ; i < r ; i++ ){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        Queue<Integer> a = new LinkedList<>();
        for(int i = 0 ; i <= q.size()-r+1 ; i++ ){
            a.offer(q.poll());
        }
        while(!a.isEmpty()){
            q.offer(a.poll());
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        System.out.print("Queue size: ");
        int k = sc.nextInt();
        System.out.println("Element of the Queue");
        for(int i = 0 ; i < k ; i++){
            q.add(sc.nextInt());
        }
        System.out.print("Rotation point : ");
        int r= sc.nextInt();
       // rotate(q,r);
        reverse(q,r);
        System.out.println(q);
    }
}
