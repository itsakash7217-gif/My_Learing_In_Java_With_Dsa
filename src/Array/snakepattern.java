package Array;
import java.util.Arrays;
import java.util.Scanner;
public class snakepattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int n = sc.nextInt();
        System.out.print("Enter the coloum: ");
        int m = sc.nextInt();
        System.out.println("Now Enter the Matrix Elements: ");
        int[][] arr = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < m ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[] pattern =SnakePrint(arr,n,m);
        System.out.println("This is the Snake Pattern OutPut: ");
        System.out.println(Arrays.toString(pattern));
    }
    static int[] SnakePrint(int[][] arr , int n, int m){
        int rightcoloum=m;
        int bottomrow=n;
        int count=0;
        int[] result=new int[n*m];
        int index=0;
        int product=rightcoloum*bottomrow;
        while(count<product){
            for(int i = 0; i < m && count<product; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < m; j++) {
                        result[index++] = arr[i][j];
                        count++;
                    }
                } else {
                    for (int j = m - 1; j >= 0 && count < product; j--) {
                        result[index++] = arr[i][j];
                        count++;
                    }
                }
            }
        }
        return result;
    }
}
