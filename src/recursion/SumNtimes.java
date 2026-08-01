package recursion;
import java.util.Scanner;
public class SumNtimes {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value Of N : ");
        int a = sc.nextInt();
        System.out.println("This is the fill ans : " +Sum(a));
    }
    static int Sum(int a){
        if(a==0) return 0;
        return Sum(a-1)+a;
    }
}
