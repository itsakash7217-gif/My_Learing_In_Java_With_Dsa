package cognizant;
import java.util.*;
public class unique {
    static void main() {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print("These are the unique path to reach our destination in different roots : "+countpath(0,0,n,m));
    }
    static int countpath(int sr , int sc,int n,int m){
        if(sr>=n||sc>=m) return 0;
        if(sr==n-1&&sc==m-1) {
            return 1;
        }
       return countpath(sr + 1, sc, n, m) +countpath(sr, sc + 1, n, m);
    }
}
