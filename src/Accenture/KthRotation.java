package Accenture;
import java.util.*;
public class KthRotation {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Elements");
        for(int i = 0; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Kth");
        int k =sc.nextInt();
        swap(arr,0,n-k-1);
        swap(arr,n-k,n-1);
        swap(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i ,int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
