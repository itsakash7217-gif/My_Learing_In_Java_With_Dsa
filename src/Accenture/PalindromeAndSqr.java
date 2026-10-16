package Accenture;
import java.util.*;;
public class PalindromeAndSqr {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (int) Math.sqrt(n);
        boolean flag =false;
        a+=1;
        while(!flag){
            if(isPal(a)){
                System.out.print(a*a);
                flag=true;
            }
            a++;
        }
    }
    public static boolean isPal(int a){
        int c =a;
        int b = 0 ;
        while(a>0){
            b=(b*10)+(a%10);
            a/=10;
        }
        return c==b;
    }
}
