package recursion;
import java.util.*;
public class permutation {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String a =  sc.next();
        multiway(a,"");
    }
    static void multiway(String a,String s){
        if(a.isEmpty()) {
            System.out.println(s);
            return;
        }
        for(int i = 0 ; i < a.length();i++){
            char ch = a.charAt(i);
            String s1 = a.substring(0,i);
            String s2 = a.substring(i+1);
            String b = s1+s2;
            multiway(b,s+ch);
        }
    }
}
