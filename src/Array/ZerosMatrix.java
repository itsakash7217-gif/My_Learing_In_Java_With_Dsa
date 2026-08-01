package Array;
import java.util.*;
public class ZerosMatrix {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr= new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j =0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        setZeroes(arr);
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
        public static void setZeroes(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;

            boolean firstRowZero = false;
            boolean firstColZero = false;

            // Check Learning.first column
            for (int i = 0; i < row; i++) {
                if (matrix[i][0] == 0) {
                    firstColZero = true;
                    break;
                }
            }

            // Check Learning.first row
            for (int j = 0; j < col; j++) {
                if (matrix[0][j] == 0) {
                    firstRowZero = true;
                    break;
                }
            }

            // Mark rows and columns
            for (int i = 1; i < row; i++) {
                for (int j = 1; j < col; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            // Set zeros based on markers
            for (int i = 1; i < row; i++) {
                for (int j = 1; j < col; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            // Zero Learning.first row
            if (firstRowZero) {
                for (int j = 0; j < col; j++) {
                    matrix[0][j] = 0;
                }
            }

            // Zero Learning.first column
            if (firstColZero) {
                for (int i = 0; i < row; i++) {
                    matrix[i][0] = 0;
                }
            }
        }
    }


