package cognizant;

import java.util.*;

public class minSumOrder {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String s = sc.next();
        int total=0;
        for(char a:s.toCharArray()){
            total+=a-'0';
            System.out.print(total);
        }
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int score = 0 ;
        for(int  i= n-1; i >=0 ; i--){
            score+=total;
            char temp = arr[i];
            int a = arr[i]-'0';
            total=total-a;
        }
        System.out.print(score);
    }
}
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        int start= 0 ;
//        int last = n-1;
//        while(start<last){
//            int temp = arr[start];
//            arr[start] = arr[last];
//            arr[last] = temp;
//            start++;
//            last--;
//        }
//    for(int i=n-2;i>=0;i--){
//            arr[i] = arr[i+1]+arr[i];
//        }
//        int total = 0;
//        for(int i=0;i<n;i++){
//            total+=arr[i];
//        }
//        System.out.println(total);
