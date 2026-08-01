package Array;
import java.util.*;
public class SubGroupingArrPreSubSum {
    static int SumofElement(int[] arr){
        int sum=0;
        for(int i =0 ; i<arr.length ; i++){
            sum+=arr[i];
        }
        return sum;
    }
    static boolean SumEqualPart(int[] arr){
        int sum=SumofElement(arr);
        int pre=0;
        for(int i = 0 ; i < arr.length; i++){
            pre+=arr[i];
            int suf = sum-pre;
            if(pre==suf){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the element :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean xyz = SumEqualPart(arr);
        System.out.println(xyz);
    }
}
