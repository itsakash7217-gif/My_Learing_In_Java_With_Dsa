package Accenture;
import java.util.*;
public class AdjacentChar {
    static void main() {
        Scanner s =new Scanner(System.in);
        String str=s.next();
        s.close();
        Stack<Character> q = new Stack<>();
        for(int i=0;i<str.length();i++) {
            char temp = str.charAt(i);
            if(q.isEmpty()){
                q.add(temp);
            }else{
                if(q.peek()==temp){
                    q.pop();
                }else{
                    q.add(temp);
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        while(!q.isEmpty()){
            sb.append(q.pop());
        }
        System.out.print(sb.reverse().toString());
    }
}
