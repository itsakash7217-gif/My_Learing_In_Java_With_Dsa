package Capgemini;
import java.util.*;
public class CountRepeatCharArrange {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 1;
        String ans = ""+s.charAt(0);
        while(i<s.length()){
            int count = 1;
            char ch = s.charAt(i);
            while(i<s.length() && s.charAt(i-1)==s.charAt(i)){
                count++;
                i++;
            }
            if(count>1){
                ans+=count;
            }else{
                ans+=ch;
                i++;
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
