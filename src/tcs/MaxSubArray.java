// kadane's Algorithm
package tcs;
import java.util.*;
public class MaxSubArray {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        SumofMaxSubArray(arr,n);
    }
    static void SumofMaxSubArray(int[] arr,int n){
    int max = Integer.MIN_VALUE;
    int x=0;
    int a =0;
    int b =0;
    int pre=arr[0];

        for(int i=0;i<n;i++){
            pre+=arr[i];
            x+=arr[i];
            if(x>=0) {
                if(x-arr[i]<pre){
                    a=i;
                }
            }
            if(max<x) {
                max = Math.max(max, x);
                b=i;
            }
            if(x<0){
                x=0;
                pre=0;
            }
        }
        for(int j=a;j<b;j++){
            System.out.println(arr[j]);
        }
        System.out.println();
        System.out.print(max);
    }
}
