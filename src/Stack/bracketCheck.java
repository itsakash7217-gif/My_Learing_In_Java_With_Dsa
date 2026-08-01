package Stack;
import java.util.*;
public class bracketCheck {
    public static boolean Checkbracket(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i <s.length();i++){
            if(s.charAt(i)=='('){
                st.push('(');
            }
            else{
                if(st.size()==0) return false;
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) return false;
        else return true;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Checkbracket(s));
    }
}
