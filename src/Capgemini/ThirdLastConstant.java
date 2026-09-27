package Capgemini;

import java.util.Scanner;

public class ThirdLastConstant {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s=s.toLowerCase();
        int count=0;
        for(int i = s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if("aeiou".indexOf(ch)==-1){
                count++;
            }
            if(count==3){
                System.out.printf("This is the third last consonants: %s",ch);
                return;
            }
        }
        System.out.println("Non 3last last consonant int this String ");
        sc.close();
    }
}
