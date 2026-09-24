package Capgemini;
import java.util.*;
public class reachLastIndex {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max_jump = 0;
        for(int i =0 ; i < n; i++){
            if(i > max_jump){
                System.out.print("False");
                return;
            }
            max_jump=Math.max(max_jump,arr[i]+i);
            if(max_jump>=n-1){
                System.out.print("True");
                return;
            }
        }
    }
}
