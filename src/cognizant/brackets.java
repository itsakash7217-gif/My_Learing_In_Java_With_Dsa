package cognizant;
import java.util.*;
public class brackets {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='('){
                 st.push(s.charAt(i));
             }
             if(s.charAt(i)==')'){
                 if(!st.isEmpty()&&st.peek()=='('){
                     st.pop();
                 }else{
                     st.push(s.charAt(i));
                 }
             }
             if(s.charAt(i)=='{'){
                 st.push(s.charAt(i));
             }
             if(s.charAt(i)=='}'){
                 if(!st.isEmpty()&&st.peek()=='{'){
                     st.pop();
                 }else{
                     st.push(s.charAt(i));
                 }
             }
             if(s.charAt(i)=='['){
                 st.push(s.charAt(i));
             }
             if(s.charAt(i)==']'){
                 if(!st.isEmpty()&&st.peek()=='['){
                     st.pop();
                 }else{
                     st.push(s.charAt(i));
                 }
             }
         }
         if(st.isEmpty()){
             System.out.print("Valid");
         }else{
             System.out.print("Invalid");
         }
    }
}
