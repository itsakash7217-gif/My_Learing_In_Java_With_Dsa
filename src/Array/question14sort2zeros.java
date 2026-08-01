package Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class question14sort2zeros {
    static int[] Exchange(int[] arr ,int left, int right){
            int x = arr[left];
            arr[left] = arr[right];
            arr[right] = x;
            return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the element :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array :");
        for(int i = 0 ; i < n; i++){
            arr[i] =sc.nextInt();
        }
        int left=0 , right =n-1;
        while(left<right){
          //  if(arr[left]==1 && arr[right]==0){
            if(arr[left]%2!=0 && arr[right]%2==0){
                Exchange(arr,left,right);
                left++;
                right--;
            }
            else if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
