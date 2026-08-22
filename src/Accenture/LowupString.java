package Accenture;
import java.util.Scanner;
public class LowupString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l=0;
        int u=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z') l++;
            if(c>='A' && c<='Z') u++;
        }
        if(l>u) System.out.println(s.toLowerCase());
        else System.out.println(s.toUpperCase());
    }
}
