package recursion;
import java.util.*;
public class findvalue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the ARRAY: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Elements of the array: ");
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value that you want : ");
        int x=sc.nextInt();
        System.out.println(Find(arr,x,0));
    }
    static boolean Find(int[] arr, int x,int n){
        if(n==arr.length){
            System.out.print("Value does not exist: ");
            return false;
        }
        if(arr[n]==x) {
            System.out.print("value exist: ");
        return true;
        }
        return Find(arr, x ,n+1) ;

    }
}
