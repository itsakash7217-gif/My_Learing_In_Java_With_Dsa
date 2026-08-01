package recursion;
import java.util.ArrayList;
import java.util.Scanner;
public class KTimesMultiple {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value Of A : ");
        int a = sc.nextInt();
        System.out.print("Enter the K value : ");
        int b = sc.nextInt();
        System.out.println("Final Answer : ");
        multiple(a,b);
    }
    static void multiple(int a , int b){
        if(b==0){
            return;
        }
        multiple(a,b-1);
        System.out.println(a*b);
    }
}
