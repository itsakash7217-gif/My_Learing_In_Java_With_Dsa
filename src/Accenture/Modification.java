package Accenture;
import java.util.*;
public class Modification {
    static void main() {
        Scanner sc = new Scanner (System.in);
        int n =  sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            int temp = arr[i];
            temp-=(i%7)*3;
            if(arr[i]%11==0){
                temp+=arr[i]/11;
            }
            arr[i]=temp;
        }
        System.out.print(Arrays.toString(arr));
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
