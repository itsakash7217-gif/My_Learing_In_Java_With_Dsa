package tcs;
import java.util.Scanner;
public class MaxPastries {
    static void main() {
        Scanner sc = new Scanner(System.in) ;
        int N = sc.nextInt() ;
        int ans = 0;
        int size =0;
        for(int i=1 ; i<=N ; i++){
            int a = N;
            while(i<=a){
                a-=i;
            }
            if(a>=ans){
                ans=a;
                size=i;
            }
        }
        System.out.printf("Max No %d of pastries from the packeed size %d",ans,size);
}}

