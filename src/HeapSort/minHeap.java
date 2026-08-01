package HeapSort;
import java.util.*;
public class minHeap {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(sc.hasNextInt()){
            pq.add(sc.nextInt());
        }
        System.out.println(pq);
        for(int a : pq){
            System.out.println(a);
        }
        pq.remove(pq.peek());
        System.out.println(pq);
        for(int a : pq){
            System.out.println(a);
        }
        pq.add(1);
        System.out.println(pq);
        for(int a : pq){
            System.out.println(a);
        }
    }
}
