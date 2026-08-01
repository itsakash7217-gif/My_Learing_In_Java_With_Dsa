package Stack;
import java.util.*;
public class SimpleCopy {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is the original Stack : ");
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println("This is the second reverse Stack : ");
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);

        Stack<Integer> pt = new Stack<>();
        while(rt.size()>0){
            pt.push(rt.pop());
        }
        System.out.println("This is the copy Stack : ");
        System.out.println(pt);
        while(pt.size()>0){
            st.push(pt.pop());
        }
        System.out.println("This is the original but reverse Stack : ");
        System.out.println(st);
    }
}
