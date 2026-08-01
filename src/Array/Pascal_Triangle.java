package Array;

import java.util.*;

public class Pascal_Triangle {
    static int[][] pascalTriangle(int n ){
        int[][] arr = new int[n][];
        for(int i = 0 ; i < arr.length ; i ++){
            arr[i] = new int[i+1];
            arr[i][0]=arr[i][i]=1;
            for(int j = 1 ; j<i ; j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
        return arr;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of First Matrix :");
        int a = sc.nextInt();
        int[][] ans = pascalTriangle(a);
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
        int hash = ans.hashCode();
        System.out.println(hash);
    }
}
