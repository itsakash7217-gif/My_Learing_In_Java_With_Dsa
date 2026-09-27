package DP;

import java.util.Scanner;

public class specificPathCount {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] dp = new int[n][m];
        int i1 = sc.nextInt();
        int j1 = sc.nextInt();
        int i2 = sc.nextInt();
        int j2 = sc.nextInt();
        int ans  = check(0,0,i1,j1,dp)*check(i1,j1,i2,j2,dp)*check(j2,j2,n-1,m-1,dp);
        System.out.print(ans);
    }
    public static int check(int r,int c,int n,int m,int[][] dp){
        if(r>n || c>m) return 0;
        if(r==n && c==m) return 1;
        if(dp[r][c]!=0) return dp[r][c];
        return dp[r][c]=check(r+1,c,n,m,dp)+check(r,c+1,n,m,dp);
    }
}
