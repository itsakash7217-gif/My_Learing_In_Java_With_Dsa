package cognizant;

import java.util.*;

public class minOperation {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(operation(arr,n));
    }
    static int operation(int[] arr,int n){
Arrays.sort(arr);
        int operation = 0;
        for(int i = 0 ; i < n ;i ++){
            if(arr[i]<i+1){
                operation+=i+1-arr[i];
            }
        }
        return operation;
    }
}
