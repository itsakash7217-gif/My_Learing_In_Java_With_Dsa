package cognizant;

import java.util.Scanner;

public class WrappedItem {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        for(int i=0;i<s.length();i++) {
            if(i-1>=0 && i+1<s.length()){
                if(s.charAt(i)>='a' && s.charAt(i)<='z') {
                    int a = s.charAt(i-1)-'0';
                    int b = s.charAt(i+1)-'0';

                    if(a<10 && b<10) {
                        System.out.print(s.charAt(i)+" ");
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
