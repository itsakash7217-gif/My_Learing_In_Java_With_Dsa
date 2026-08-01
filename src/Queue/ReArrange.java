package Queue;
import java.util.*;
public class ReArrange {
    static void Arrange(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        int a = n/2;
        while(q.size()>a){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        while(q.size()>a){
            st.push(q.poll());
        }
        Creat(q,st);
    }
    static void Creat(Queue<Integer> q,Stack<Integer> st){
        while(!st.isEmpty()){
            q.offer(st.pop());
            q.offer(q.poll());
        }
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
    }
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Queue size: ");
        int k = sc.nextInt();
        System.out.println("Element of the Queue");
        for(int i = 0 ; i < k ; i++){
            q.add(sc.nextInt());
        }
        Arrange(q);
        System.out.println(q);
    }
}
