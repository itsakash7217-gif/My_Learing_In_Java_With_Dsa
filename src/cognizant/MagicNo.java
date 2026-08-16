package cognizant;

import java.util.Scanner;

public class MagicNo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0 ;i < n ;i++){
            for(int j = 0 ;j < m ;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int magicno = check(arr,m,n);
        System.out.println(magicno);
    }
    static int check(int[][] arr,int m,int n){
        int max=0;
        for(int i = 0 ;i < n ;i++){
            int count=0;
            for(int j = 0 ;j < m ;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
            if(count!=0 && count%2==0){
                max++;
            }
        }
        return max;
    }
}
