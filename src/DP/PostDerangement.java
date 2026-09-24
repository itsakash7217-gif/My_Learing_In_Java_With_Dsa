package DP;

import java.util.Scanner;

public class PostDerangement {
    static void main() {
//        this one is the Tabulation
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[1] = 0;
        dp[2] = 1;

        for (int j = 2; j <= n; j++) {
            dp[j] = (j - 1) * ((j - 2) + (j - 3));
        }
        System.out.print(dp[n]);
    }

//    this one is memoization
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] dp = new int[n+1];
//
//        System.out.print(dis(n,dp));
//    }
//    public static int dis(int n,int[] dp){
//        if(n<=1) return 1;
//        if(dp[n]!=0) return dp[n];
//        return dp[n]=(n-1)*(dis(n-2,dp)+dis(n-3,dp));
//    }
}
