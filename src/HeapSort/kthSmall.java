package HeapSort;
import java.util.*;
public class kthSmall {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,6,3,7,9,10,8,13,16};
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int a : arr) {
            pq.add(a);
            if(pq.size()>k){
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
}
