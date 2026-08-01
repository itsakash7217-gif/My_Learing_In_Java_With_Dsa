package recursion;
import java.util.Scanner;

public class Power {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }
    static int power(int a , int b){
        if(b==1) return a;
        return power(a,b-1)*a;
    }
}
