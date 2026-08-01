package Array;
import java.util.*;
public class arraywith2d {
    static void ArrayPrint(int[][] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < b ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));
        ArrayPrint(arr);
    }
}
