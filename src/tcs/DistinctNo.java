package tcs;
import java.util.*;

public class DistinctNo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0 ; i < n ; i++){
//            arr[i] = sc.nextInt();
//        }
        Set<Integer> s=new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            s.add(sc.nextInt());
        }
        for(int b : s){
            System.out.print(b+" ");
        }
        System.out.println();
        System.out.println("Distinct no: "+s.size());
    }
}
