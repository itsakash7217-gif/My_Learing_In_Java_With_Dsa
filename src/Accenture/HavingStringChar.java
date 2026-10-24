package Accenture;
import java.util.*;
public class HavingStringChar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i = 0 ; i < n ; i++){
            words[i]=sc.next();
        }
        String ans  = find(words,n);
        System.out.print(ans);
        sc.close();
    }
    public static String find(String[] words, int n){
        if(n==0) return "0";
        char[] ans = new char[n];
        int x = 0;
        for(String s : words){
            ans[x++]=s.charAt(0);
        }
        Arrays.sort(ans);
        return new String(ans);
    }
}
