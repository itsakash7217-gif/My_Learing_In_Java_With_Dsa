package tcs;
import java.util.*;
public class ChooseSheet {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int ans = Fatc(n);
        int abc = Fatc(n-r);
        System.out.println(ans/abc);
    }
    static int Fatc(int n) {
        if(n==1){
            return 1;
        }
       // System.out.println(n +" "+r);
        return Fatc(n-1)*n;
    }
}
