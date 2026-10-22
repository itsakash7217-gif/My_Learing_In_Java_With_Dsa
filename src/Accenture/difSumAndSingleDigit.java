package Accenture;
import java.util.*;
public class difSumAndSingleDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int sum = 0 ;
        for(int i =0 ; i < 6  ; i++){
            arr[i]=sc.nextInt();
        }
        int x = 1;
        while(x<6){
            sum+=Math.abs(arr[x-1]-arr[x]);
            x+=2;
        }
        System.out.println(sum);
        while(sum>9){
            int a = sum;
            int temp=0;
            while(a>0){
                temp+=a%10;
                a/=10;
            }
            sum=temp;
        }
        System.out.print(sum);
    }
}
