package Accenture;
import java.util.*;
public class ValidMatrix {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int[] row = new int[n];
            for(int j=0;j<n;j++){
                row[j]=matrix[i][j];
            }
            Arrays.sort(row);
            for(int j=0;j<n;j++){
                if(row[j]!=j+1){
                    System.out.println("False");
                    return;
                }
            }
        }
        for(int i=0;i<n;i++){
            int[] col = new int[n];
            for(int j=0;j<n;j++){
                col[j]=matrix[j][i];
            }
            Arrays.sort(col);
            for(int j=0;j<n;j++){
                if(col[j]!=j+1){
                    System.out.println("False");
                    return;
                }
            }
        }
        System.out.print("True");
    }
}
