package recursion;

public class GCD {
    static int gcd(int a , int b ){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    static void main() {
        int a = 24;
        int b = 15;
        int ans =gcd(a,b);
        System.out.println(ans);
    }
}
//        int a = 4 ;
//        int j = 9;
//        int max = 0;
//        for(int i = 1 ; i < 4; i++){
//            if(4%i==0 && 9%i==0){
//                max = Math.max(max,i);
//            }
//        }
//        System.out.println(max);
//        int a = 3 ;
//        int b = 2;
//        while(a%b!=0){
//            a%=b;
//            int temp = a;
//            a=b;
//            b=temp;
//        }
//        System.out.println(b);