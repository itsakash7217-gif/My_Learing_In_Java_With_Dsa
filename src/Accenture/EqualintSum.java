package Accenture;
import java.util.*;
public class EqualintSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int j = n-1;
        int last = 0 ;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(checkSum(mid)>n){
                last = mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        System.out.print(n-last);
    }
    public static int checkSum(int n){
        int ans = n;
        while(n>0){
            n/=10;
            ans+=n;
        }
        return ans;
    }
}
