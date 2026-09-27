package Capgemini;

import java.util.Scanner;

public class ShiftStratToBeigining {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                ans.append("*");
            }
        }
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)!='*'){
                ans.append(s.charAt(j));
            }
        }
        System.out.println(ans.toString());
    }
}
