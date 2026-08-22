package Accenture;
import java.math.BigInteger;
import java.util.Scanner;
public class NoOfCakePieces {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = (n*(n+1)/2)+1;
        long ans2 =ans%100000007;
        System.out.println(ans2);
    }
}
