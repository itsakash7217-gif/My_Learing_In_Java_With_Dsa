package recursion;

import java.util.Scanner;

public class StringremoveDuplicate {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String x = sc.nextLine();
        System.out.print(ans(x,0));
    }
    static String ans(String x,int n){
        if(n==x.length()) return "";
        String small = ans(x,n+1);
        char c = x.charAt(n);
        if(c!='a'){
            return c + small;
        }else{
            return small;
        }
    }
}
