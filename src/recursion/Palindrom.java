package recursion;
import java.util.*;
public class Palindrom {
    static boolean check(String s, int a , int b){
        if(a>=b) return true;
        return s.charAt(a)==s.charAt(b) && check(s,a+1,b-1);
    }
    static int reverse(int a , int b){
        if(a==0) return b;
        int ab = a%10;
        return reverse(a/10,b*10+ab);
    }
    static boolean Check(int b){
        if(b<0) return false;
        int rev = reverse(b,0);
        return b==rev;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.printf("Check this String %s is Palindrom :",a);
        System.out.println(check(a,0,a.length()-1));
        int b = sc.nextInt();
        System.out.printf("Now Check This Number %d that Is palindrom : ",b);
        System.out.println(Check(b));
    }
}
