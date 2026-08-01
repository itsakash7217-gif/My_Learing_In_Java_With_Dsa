package recursion;

import java.util.*;

public class FrogJump {
    static int minCost(int[] arr,int n , int idx){
        if(idx==n-1) {
            return 0;
        }
        int opt1=(Math.abs(arr[idx]-arr[idx+1])+minCost(arr,n,idx+1));
        if(idx==n-2) return opt1;
        int opt2=(Math.abs(arr[idx]-arr[idx+2])+minCost(arr,n,idx+2));
        return Math.min(opt1,opt2);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i]=sc.nextInt();
        }
        int ans = minCost(a,n,0);
        System.out.println("this is the minimum cost of the final destination :" +ans);
    }
}
