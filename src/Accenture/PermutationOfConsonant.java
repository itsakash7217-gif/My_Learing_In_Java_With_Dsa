package Accenture;
import java.util.*;
public class PermutationOfConsonant {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s=s.toLowerCase();
        int count = 0 ;
        for(int i=0;i<s.length();i++){
            if("aeiou".indexOf(s.charAt(i))==-1){
                count++;
            }
        }
        int combination = check(count);
        System.out.println("Total no of combination to rearrange string with consonants :"+combination);
    }
    public static int check(int count){
        if(count <=1) return 1;
        return count*check(count-1);
    }
}
