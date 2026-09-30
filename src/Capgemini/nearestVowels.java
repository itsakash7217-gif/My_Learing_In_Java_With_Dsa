package Capgemini;

import java.util.Scanner;

public class nearestVowels {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String vowels = "aeiou";
        StringBuilder ans  = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int min = Integer.MAX_VALUE;
            String v="";
            for (int j = 0; j < vowels.length(); j++) {
                int a = Math.abs(ch-vowels.charAt(j));
                if(a<min){
                    v+=vowels.charAt(j);
                    min=a;
                }
            }
            ans.append(v.charAt(v.length()-1));
        }
        System.out.println(ans.toString());
        sc.close();
    }
}
