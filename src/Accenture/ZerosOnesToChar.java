package Accenture;

import java.util.Scanner;

public class ZerosOnesToChar {
    static void main() {
        Scanner sc =new Scanner(System.in);
        String  s = sc.next();
        int i = 0;
        String ans = "";
        while(i<s.length()){
            int count = 0 ;
            while(i<s.length() && s.charAt(i)=='1'){
                count++;
                i++;
            }
            ans+=(char)(count+'a'-1);
            if(i<s.length() && s.charAt(i)=='0'){
                count=0;
                i++;
            }
        }
        System.out.println(ans.toUpperCase());
    }
}
