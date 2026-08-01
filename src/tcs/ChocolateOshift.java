package tcs;

import java.util.*;

public class ChocolateOshift {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<n){
            arr[count++]=0;
        }
        System.out.print(Arrays.toString(arr));

//        int a = 0;
//        int b = 0;
//        int c = 0;
//        int count=0;
//        //int check = arr[0];
//        while(a<n){
//            while(arr[a]==0 && b<n){
//                if(arr[b]!=0) {
//                    int temp = arr[b];
//                    arr[b] = arr[c];
//                    arr[c] = temp;
//
//                }
//                b++;
//            }
//            a++;
//            c++;
//            b=a;
//        }
//        int l =arr.length-1;
//        for(int i = 1 ; i<=count  ; i++){
//            arr[l--]=0;
//        }
//        System.out.print(Arrays.toString(arr));
    }
}
// 100110
