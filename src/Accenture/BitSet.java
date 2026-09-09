package Accenture;
import java.util.*;
public class BitSet {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String bit = Integer.toBinaryString(n);
        bits(n);
        binary(n);
        int count=0;
        for(int i = 0 ; i < bit.length () ; i++){
            if(bit.charAt(i)=='1'){
                count++;
            }
        }
        System.out.print(count);
    }
    static void bits(int n){
        int bit =0 ;
        while(n>0){
            bit+=n%2;
            n=n>>1;
//            n/=2;
        }
        System.out.println(bit);
    }
    static void binary(int n){
        int count = 0 ;
        while(n>0){
            count++;
            n=n&n-1;
        }
        System.out.println(count);
    }
}
