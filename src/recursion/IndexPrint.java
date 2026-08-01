package recursion;
import java.util.*;
public class IndexPrint {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i <arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        print(arr,x);
    }
    static int[] print(int[] arr , int x){
        if(x==arr.length) return null;
        System.out.println(arr[x]);
        return print(arr,x+1);
    }
}
