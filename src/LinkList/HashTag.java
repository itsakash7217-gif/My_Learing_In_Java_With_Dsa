package LinkList;
import java.util.*;
public class HashTag {
    static void main() {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k= sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i= 0 ; i < n ; i++){
            pq.add(arr[i]);
            if(pq.size()>k) pq.remove();
        }
        System.out.print(pq.peek());
    }
}
