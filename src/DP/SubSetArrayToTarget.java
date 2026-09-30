package DP;

//knapsack
import java.util.Arrays;

public class SubSetArrayToTarget {
    static void main() {
        int[] arr = {0,8,5,2,4};
        int target = 9;
        int[][] dp = new int[arr.length][target+1];
        for(int i=0;i<arr.length;i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.print(checkSubset(arr,target,0,dp));
    }
    public static boolean checkSubset(int[] arr, int target,int i,int[][] dp) {
        if(i==arr.length){
            if(target==0) return true;
            else return false;
        }
        if(dp[i][target]!=-1) return dp[i][target]==1;
        boolean ans =false;
        boolean skip = checkSubset(arr,target,i+1,dp);
        if(target-arr[i]<0){
            return skip;
        }else {
            boolean pick = checkSubset(arr, target - arr[i], i + 1, dp);
            ans = skip || pick;
        }
        if(!ans) dp[i][target]=0;
        else dp[i][target]=1;
        return ans;
    }
}
