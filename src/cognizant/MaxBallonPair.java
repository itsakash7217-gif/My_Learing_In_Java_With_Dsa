package cognizant;

import java.util.Scanner;

public class MaxBallonPair {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] packet = new int[n];
        int[] cost= new int[n];
        for(int i=0;i<n;i++){
            packet[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            cost[i] = sc.nextInt();
        }
        int max = pair(packet,cost,n,m);
        System.out.print(max);
    }
    static int pair(int[] packet,int[] cost,int n,int m){
        int max = Integer.MIN_VALUE; ;
        for(int i = 0 ;i < n; i++){
            for(int j = i+1 ; j < n ;j++){
                if(cost[i]+cost[j]<=m){
                    max=Math.max(packet[i]+packet[j],max);
                }
            }
        }
        return max;
    }
}
