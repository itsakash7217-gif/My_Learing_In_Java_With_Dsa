package Accenture;
import java.util.*;
public class GrowthSaleWithKth {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of days");
        int n =  sc.nextInt();
        System.out.println("Enter the number that will use check the growth sale for each day");
        int k = sc.nextInt();
        System.out.println("Day by Day sale");
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0 ;
        int start = 0 ;
        while(arr[start]==0){
            start++;
        }
        for(int i = start+1 ; i<n ; i++){
            if(arr[i]!=0){
                if(arr[i]-arr[start]>=k){
                    count++;
                    start = i;
                }else{
                    start = i;
                }
            }
        }
        System.out.println("Growth sale for each day"+count);
    }
}
