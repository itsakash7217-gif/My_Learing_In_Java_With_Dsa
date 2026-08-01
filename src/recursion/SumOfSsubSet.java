package recursion;
import java.util.*;
public class SumOfSsubSet {
    static void ss(int[] a,int n,int result){
        if(n==a.length){
            System.out.println(result);
            return;
        }
        int temp = a[n];
        ss(a,n+1,result+temp);
        ss(a,n+1,result);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Total possible sum of this array: ");
        ss(a,0,0);
    }
}
