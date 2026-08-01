package recursion;
import java.util.Scanner;
public class CountDigit {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Count(a));
    }
    static int Count(int a){
        if(a<=9) return 1;
        return Count(a/10)+1;
    }
}
