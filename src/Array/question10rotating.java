package Array;
import java.util.*;
public class question10rotating {
    static int[] ktimerotate(int[] arr , int k){
        int n = arr.length;
        k = k % n;
        int[] arr_2 = new int[n];
        int a = 0;

        for(int i = n-k; i<n ; i++){
            arr_2[a++] = arr[i];
        }
        for(int i = 0 ; i <= n-k-1 ; i++){
            arr_2[a++] = arr[i];
        }
        return arr_2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("K time rotation :");
        int k =sc.nextInt();
        System.out.println(Arrays.toString(arr));
        int[] rotation = ktimerotate(arr,k);
        System.out.println(Arrays.toString(rotation));
    }
}
