package recursion;

import java.util.Scanner;

public class reverseString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String x = sc.nextLine();
        System.out.print("this is the reverse of the given String: ");

        System.out.print(reverse(x,0));
    }
    static String reverse(String x,int n){
        if(n==x.length()) return "";
        String small = reverse(x,n+1);
        return small+x.charAt(n);
    }
}
