package Accenture;
import java.util.*;
public class DecryptString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.nextLine();
        int n = sc.nextInt();
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(st.isEmpty() && s.charAt(i)>='a' && s.charAt(i)<='z'){
                st.push(s.charAt(i));
            }else if(s.charAt(i)>='1'  && s.charAt(i)<='9'){
                char c = st.pop();
                for(int j = 0;j < (int) (s.charAt(i)-'0');j++){
                    ans.append(c);
                }
            }else{
                st.push(s.charAt(i));
            }
        }
        System.out.println(ans);
        System.out.println(ans.charAt(n));
    }
}
