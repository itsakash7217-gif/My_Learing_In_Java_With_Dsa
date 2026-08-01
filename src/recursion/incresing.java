package recursion;
import java.util.*;
public class incresing {
    static void Increasing(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        Increasing(n-1);
        System.out.print(n+" ");
    }
    static void Decreasing(int n){
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        Decreasing(n-1);
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : " );
        int i = sc.nextInt();
        System.out.println("This is the increasing order :");
        Increasing(i);
        System.out.println(" ");
        System.out.println("This one is Decreasing order : ");
        Decreasing(i);
    }
}
