package recursion;
import java.util.Scanner;
public class sumAlldigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Sum(a));
    }
    static int Sum(int a){
        if(a>=0 && a<=9){
            return a;
        }
        return Sum(a/10) + a%10;
    }
}
