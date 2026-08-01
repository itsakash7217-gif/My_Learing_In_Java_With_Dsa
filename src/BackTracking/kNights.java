package BackTracking;
import java.util.*;
public class kNights {
    static int point =5;
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 'x';
            }
        }
        nposition(arr,0,0,0);
    }
    static void nposition(char[][] arr,int n,int p,int kn){
        int m = arr.length;
        if(n==m) {
            if(kn==point) {
                for(int i = 0; i < m; i++) {
                    for(int j = 0; j < m; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            return;
        }
                if(ischeck(arr,n,p)){
                    arr[n][p]='K';
                    if(p!=m-1) nposition(arr,n,p+1,kn+1);//m=3-1=2; p 0,1,2
                    else nposition(arr,n+1,0,kn+1);
                    arr[n][p]='x';
                }
                    if(p!=m-1) nposition(arr,n,p+1,kn);
                    else nposition(arr,n+1,0,kn);

        }
    static boolean ischeck(char[][] arr,int n,int m){
        int l = arr.length;
        int r,c;
        r=n+2;
        c=m+1;
        if(r<l && c<l && arr[r][c]=='K') return false;
        r=n+2;
        c=m-1;
        if(r<l && c>=0 && arr[r][c]=='K') return false;
        r=n+1;
        c=m+2;
        if(r<l && c<l && arr[r][c]=='K') return false;
        r=n-1;
        c=m+2;
        if(r>=0 && c<l && arr[r][c]=='K') return false;
        r=n-2;
        c=m+1;
        if(r>=0 && c<l && arr[r][c]=='K') return false;
        r=n-2;
        c=m-1;
        if(r>=0 && c>=0 && arr[r][c]=='K') return false;
        r=n+1;
        c=m-2;
        if(r<l && c>=0 && arr[r][c]=='K') return false;
        r=n-1;
        c=m-2;
        if(r>=0 && c>=0 && arr[r][c]=='K') return false;
        return true;
    }
}
