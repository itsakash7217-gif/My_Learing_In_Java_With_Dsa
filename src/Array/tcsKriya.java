package Array;
import java.util.*;
public class tcsKriya {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        int b =1;
        for(int i = 0 ; i < m ; i++) {
            arr[i] = b++;

        }
        int ans = 0;
        for(int i = m-1 ; i >=1 ; i-=2){
            ans+=arr[i];

        }


       System.out.println(n*ans);
    }
}
// 1 2 3 4 5 6
