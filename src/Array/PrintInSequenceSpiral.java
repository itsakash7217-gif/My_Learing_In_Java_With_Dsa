package Array;

import java.util.Arrays;
import java.util.Scanner;
//import java.util.rotage90Degree;
public class PrintInSequenceSpiral {
    static void ArrayPrint(int[][] arr,int a , int b){
        System.out.println("Matrix Of The Given Arrays:-");
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < b ; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        return;
    }
    static int[][] spiralArray(int a){
        int toprow=0 , rightcolum = a-1 , bottomrow = a-1 , leftcolum =0;
        int totalelement=0;
        int[][] arr = new int[a][a];
        int b = 1;
        System.out.println("Array elements in spiral Form: ");
        while(totalelement < a * a) {
            for (int j = toprow; j <= rightcolum && totalelement < a * a; j++) {
                arr[toprow][j] = b++;
//                System.out.print(arr[toprow][j] + " ");
                totalelement++;
            }
            toprow++;
//            System.out.println("");
            for (int i = toprow; i <= bottomrow && totalelement < a * a; i++) {
                arr[i][rightcolum] = b++;
//                System.out.print(arr[i][rightcolum]+" ");
                totalelement++;
            }
            rightcolum--;
//            System.out.println("");
            for (int j = rightcolum; j >= leftcolum && totalelement < a * a; j--) {
                arr[bottomrow][j] = b++;
//                System.out.print(arr[bottomrow][j] + " ");
                totalelement++;
            }
            bottomrow--;
//            System.out.println("");
            for (int i = bottomrow; i >= toprow && totalelement < a * a; i--) {
                arr[i][leftcolum] = b++;
//                System.out.print(arr[i][leftcolum] + " ");
                totalelement++;
            }
            leftcolum++;
//            System.out.println("");

        }
        return arr;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sqaure Matrix Of N*N Than the Value of N :");
        int a = sc.nextInt();
        int[][] ans = spiralArray(a);
        ArrayPrint(ans,a,a);
        //spiralArrayAntiClockWise(a);
    }
}
