package recursion;

import java.util.Scanner;

public class SumArray {
    static int sum(int[] arr,int n){
        if(n==arr.length-1) return arr[n];
        return arr[n]+sum(arr,n+1);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr,0));
    }
}
