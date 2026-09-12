package Accenture;
import java.util.*;
public class passwordNonrepeatLength {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = Integer.MIN_VALUE;
        int l=0;
        for(int i = 0 ; i < s.length() ; i++){
            boolean flag = false;
            Set<Character> set = new HashSet<>();
            for(int j = i ; j < s.length() ; j++){
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    l++;
                    max=Math.max(max,l);
                }else {
                    l = 0;
                    break;
                }
                if(j==s.length()-1){
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
