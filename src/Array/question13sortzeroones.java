package Array;

import java.util.*;

public class question13sortzeroones {
    static int[] check(int[] arr){
        int n = arr.length;
        int x = 0 ;
        for(int i = 0 ; i< n; i++) {
            if (arr[i] == 0) {
                x++;
            }
        }
            for(int j = 0 ; j<n ;j++){
                if(j<x ){
                arr[j] = 0;
                }else{
                    arr[j]=1;
                }
            }
            return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        check(arr);
        System.out.println(Arrays.toString(arr));
    }
}
