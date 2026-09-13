package Accenture;
import java.util.*;
public class ModuleByEleven {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = Integer.parseInt(s);
        int ans = n%11;
        System.out.println(ans);
        sc.close();
    }
}
