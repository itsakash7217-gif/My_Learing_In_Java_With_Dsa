import java.util.*;
public class question8ArraySwapping {
    static int[] justreverse(int[] arr){
        int count = 0;
        int l = arr.length;
        int []arr2 = new int[l];
        for(int i = l-1 ; i >= 0 ; i--){
            arr2[count++] = arr[i];
        }
        return arr2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the elements of Array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int[] reverse = justreverse(arr);
        System.out.println("the reverse Array");
        System.out.println(Arrays.toString(reverse));
    }
}