package Capgemini;
import java.util.*;
public class removeDuplicate {
    static void main() {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        StringBuilder ans  = new StringBuilder();
        HashMap<Character, Boolean> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,true);
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.get(c)==true) {
                ans.append(c);
                map.put(c,false);
            }
        }
        System.out.println(ans.toString());
        sc.close();
    }
}
