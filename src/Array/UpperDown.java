package Array;

import java.util.*;

public class UpperDown {
    static void DownTriangle(int[][] arr,int a){
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < a ; j++){
                if(j<=i){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        return;
    }
    static void UpperTriangle(int[][] arr,int a){
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < a ; j++){
                if(j>=i){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of First Matrix :");
        int a = sc.nextInt();
        //System.out.print("Enter the colum of First Matrix :");
      //  int b = sc.nextInt();
        int[][] arr = new int[a][a];
        for(int i = 0 ; i < a ; i++){
            for(int j = 0 ; j < a ; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Down Triangle of Matrix");
        UpperTriangle(arr,a);
        System.out.println("Upper Triangle of Matrix");
        DownTriangle(arr,a);
    }
}
