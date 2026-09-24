package DP;

import java.util.Arrays;
import java.util.Scanner;

public class FrindsPairing {
    static void main() {
//        this is the tabulation
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] dp = new int[a+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=a;i++){
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        System.out.println(dp[a]);
    }
//        This is the Memoization
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int[] dp = new int[a+1];
//        Arrays.fill(dp,-1);
//        System.out.print(pairing(a,dp));
//    }
//    static int pairing(int a,int[] dp) {
//        if(a<=1) return 1;
//        if(a==2) return 2;
//        if(dp[a]!=-1) return dp[a];
//        return dp[a]=pairing(a-1,dp)+(a-1)*pairing(a-2,dp);
//    }
}
