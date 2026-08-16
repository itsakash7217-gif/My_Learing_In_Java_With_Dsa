package cognizant;
import java.util.*;
public class SttringRepeatsequence {
    static void main() {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String ans = "";
        for(char ch : s.toCharArray()){
            int n = ch-'a'+1;
            for(int i = 0 ; i < n ; i++){
                ans+=ch;
            }
            ans+='-';
        }
        System.out.println(ans.subSequence(0,ans.length()-1));
    }
}
