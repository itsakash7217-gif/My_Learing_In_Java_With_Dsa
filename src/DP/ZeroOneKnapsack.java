package DP;
// Brute force method
import java.util.*;
public class ZeroOneKnapsack {
    public static int check(int i , int[] p, int[] w, int c,int[][] dp){
        if(i>=p.length) return 0;
        if(dp[i][c]!=-1) return dp[i][c];
        int skip = check(i+1,p,w,c,dp);
        if(w[i]>c) return dp[i][c]=skip;
        int pick = p[i]+check(i+1,p,w,c-w[i],dp);
        return dp[i][c]=Math.max(pick, skip);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of House you want to store: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("Enter the capacity of the House you want to store: ");
        int w = sc.nextInt();
        System.out.println();
        int[] profits = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter your %d no. to store of profit: ",i+1);
            profits[i] = sc.nextInt();
            System.out.printf("Enter your %d no. to store of weight: ",i+1);
            weights[i] = sc.nextInt();
            System.out.println();
        }
        int[][] dp = new int[n][w+1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i],-1);
        }
        int profit=check(0,profits,weights,w,dp);
        System.out.println(profit);
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i < n; i++) {
//            int profit = 0 ;
//            int weight = 0;
//            for(int j = i; j < n; j++) {
//                weight += weights[j];
//                if(weight<=w){
//                    profit+=profits[j];
//                }
//            }
//            max=Math.max(max,profit);
//        }
//        System.out.println("This the total profit: "+max);
    }
}
