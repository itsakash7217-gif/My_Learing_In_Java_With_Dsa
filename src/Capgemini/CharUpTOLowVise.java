package Capgemini;

import java.util.Scanner;

public class CharUpTOLowVise {
    static void main() {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        if(s>='A'&& s<='Z') {
            s= (char) (s+32);
        }else if(s>='a'&& s<='z') {
            s= (char) (s-32);
        }
        System.out.print(s);
    }
}
