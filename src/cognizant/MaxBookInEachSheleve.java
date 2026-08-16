package cognizant;

import java.util.Scanner;

public class MaxBookInEachSheleve {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max=book(arr,n,m);
        System.out.println(max);
    }
    static int book(int[] arr,int n,int m){
        int max = 0 ;
        int i =1;
        while(i<=n){
            if(isPrime(i)){
//                System.out.println(i);
                if(arr[i-1]>m){
                    max+=m;
                }else{
                    max+=arr[i-1];
                }
            }
            i++;
        }
        return max;
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
