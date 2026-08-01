package Stack;
import java.util.*;
public class recursiveReverse {
    public static void sameorder(Stack<Integer> st){
        if(st.size()==0) return;
        int x = st.pop();
        sameorder(st);
        System.out.print(x+" ");
        st.push(x);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==0) return;
        int x = st.pop();
        System.out.print(x+" ");
        reverse(st);
        st.push(x);
    }
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.print(st);
        System.out.println();
        reverse(st);
        System.out.println();
        sameorder(st);
    }
}
