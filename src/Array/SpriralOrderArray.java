package Array;
import java.util.Scanner;

public class SpriralOrderArray {

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
    static void SpiralPrint(int[][] arr , int r , int l){
        int toprow=0 , rightcolum = l-1 , bottomrow = r-1 , leftcolum =0;
        int totalelement=0;
        System.out.println("Array elements in spiral Form: ");
        while(totalelement < r * l){
            for(int j = toprow ; j<=rightcolum && totalelement < r * l ; j++){
                System.out.print(arr[toprow][j]+" ");
                totalelement++;
            }
            toprow++;
            for(int i=toprow; i<=bottomrow && totalelement < r * l ; i++){
                System.out.print(arr[i][rightcolum]+" ");
                totalelement++;
            }
            rightcolum--;
            for(int j= rightcolum; j>=leftcolum && totalelement < r * l ; j--){
                System.out.print(arr[bottomrow][j]+" ");
                totalelement++;
            }
            bottomrow--;
            for(int i=bottomrow; i>=toprow && totalelement < r * l ; i--){
                System.out.print(arr[i][leftcolum]+" ");
                totalelement++;
            }
            leftcolum++;
        }
    }
    static void main() {
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
        SpiralPrint(arr,a,b);
    }
}
