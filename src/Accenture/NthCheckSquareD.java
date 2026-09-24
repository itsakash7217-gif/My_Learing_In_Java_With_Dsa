package Accenture;
import java.util.*;
public class NthCheckSquareD {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            int a = i*i;
            int b = a%10;
            if(b==d) count++;
        }
        System.out.println(count);
    }
}
