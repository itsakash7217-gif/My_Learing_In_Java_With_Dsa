package Array;

import java.util.*;

public class transpose {
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
    static void transposeMatrix(int[][] arr , int a , int b){
        int[][] arr_trans = new int[a][b];
        for(int i = 0 ; i <a ; i++){
            for(int j =0 ; j < b ; j++) {
                arr_trans[i][j] = arr[j][i];
                System.out.print(arr_trans[i][j]+ " ");
            }
            System.out.println( );
        }
        return;
    }
    static void transposeInPlace(int[][] arr , int a){
//        int ele;
        for(int i = 0 ; i <a ; i++){
            for(int j =i ; j < a ; j++) {
                    int ele = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = ele;
                  //  System.out.print(arr[i][j]+ " ");

            }
            //System.out.println( );
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of First Matrix :");
        int a = sc.nextInt();
        System.out.print("Enter the colum of First Matrix :");
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < b ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        ArrayPrint(arr,a,b);
        //System.out.println("Transpose of the array Matrix : ");
        //transposeMatrix(arr,a,b);
        System.out.println("Transpose in Place of the Array m");
        transposeInPlace(arr,a);
        ArrayPrint(arr,a,a);
    }
}
