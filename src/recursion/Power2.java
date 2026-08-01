package recursion;
import java.util.Scanner;
public class Power2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = sc.nextInt();
        System.out.print("Enter the opower : ");
        int b = sc.nextInt();
        System.out.print("Final Answer : ");
        System.out.println(power2(a,b));
    }
    static int power2(int a ,int b){
        if(b==0) return 1;
        int pro = power2(a,b/2);
        if(b%2==0){
            return power2(a,b/2)*power2(a,b/2);
        }else{
            return power2(a,b/2)*power2(a,b/2)*a;
        }
    }
}
