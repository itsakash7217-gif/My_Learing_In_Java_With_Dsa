package Array;
import java.util.*;
public class antidiagonal {
    static void main() {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[] abc =  antiDiagonal(arr);
        System.out.println(Arrays.toString(abc));
    }
    public static int[] antiDiagonal(int[][] arr){
        int n = arr.length;
        int row =n-1;
        int coloum = 0;
        int[] abc =new int[n];
        int a = 0 ;
        while(row>=0 && coloum<n){
            abc[a]=arr[row][coloum];
            a++;
            row--;
            coloum++;
        }
        return abc;
    }
}
