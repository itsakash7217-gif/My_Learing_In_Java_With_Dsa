package Array;
import java.util.*;
public class prefixSum {
    static int[] prefixSumofArray(int[] arr){
        for(int i =1; i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the element :");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter the element of array :");
        for(int i = 1 ; i <= n; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] prefix =prefixSumofArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the Number of queries");
        int q = sc.nextInt();
        while(q-- >0){
            System.out.print("Enter the Range of the prefix sum:");
            int a =sc.nextInt();
            int b =sc.nextInt();
            int ans = prefix[b]-prefix[a-1];
            System.out.println("Sum of the prifix Array of the Queries range of the given Number: " +ans);

        }
    }
}
