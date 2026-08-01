package recursion;

import java.util.Scanner;

public class maxValue {
    static int find(int[] arr,int n){
        if(n==arr.length-1) return arr[n];
        int small = find(arr,n+1);
        return Math.max(small,arr[n]);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        int max = find(arr,0);
        System.out.println(" this is the maximum value in the array: " +max);
    }
}
