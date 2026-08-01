package Array;

import java.util.Scanner;

public class rotage90Degree {
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
        ArrayPrint(arr,a,a);
        for(int i = 0 ; i < a ; i++) {
            RotationWith90D(arr[i]);
        }
    }
    static void RotationWith90D(int[] arr ){
       // int x;
       // for(int i = 0  ; i < a ; i++){
            int left =0;
            int right = arr.length-1;
            while(left<right){
                int x = arr[left];
                arr[left]=arr[right];
                arr[right]=x;
                left++;
                right--;
            }
       // }
       // ArrayPrint(arr,a,a);
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
        System.out.println("complete rotation");
        ArrayPrint(arr,a,a);
    }
}
