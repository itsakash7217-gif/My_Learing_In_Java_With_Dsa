package Accenture;
import java.util.*;
public class IndexPrimeSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = sc.nextInt();
        }
        int sum = 0 ;
        for(int arr_j=0; arr_j < n; arr_j++){
            if(isPrime(arr_j)){
                sum+=arr[arr_j];
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i = 2 ; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
