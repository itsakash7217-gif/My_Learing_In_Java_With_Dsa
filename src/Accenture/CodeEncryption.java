package Accenture;

import java.util.*;

public class CodeEncryption {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ' ') {
                ans.append(' ');
                continue;
            }

            int a = (int) ch;
            int b = a % 26;
            if(b==0) b=26;
            ans.append((char) b);
        }

        System.out.println(ans);
        sc.close();
    }
}