package Array;
import java.util.*;
//import static Array.question11rotation_2.reverse;
public class non_decreaseSquare {
    static int[] reverse(int[] new1,int x , int y){
        while(x<y){
            int o = new1[x];
            new1[x]=new1[y];
            new1[y]=o;
            x++;
            y--;
        }
        return new1;
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
        System.out.println(Arrays.toString(arr));
        int left = 0,right =n-1;
        int k = 0;
        int[] new1 = new int[arr.length];
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                new1[k++] = arr[left]*arr[left];
                left++;
            }else{
                new1[k++] = arr[right]*arr[right];
                right--;
            }
        }
        System.out.println(Arrays.toString(new1));
        int x =0;
        int y = new1.length;
    reverse(new1,0,new1.length-1);
        System.out.println("reverse"+Arrays.toString(new1));
    }
}
