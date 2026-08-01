package Array.paper;
import java.util.*;
public class q1java {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the ArraySize");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(finding(arr));
    }
    static int finding(int[] arr){
        int x = 1 ;
        for(int num : arr){
            if(num==x){
                x++;
        }
        }
        return x;
    }
}
