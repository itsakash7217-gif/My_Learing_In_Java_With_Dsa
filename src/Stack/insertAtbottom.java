package Stack;
import java.util.Stack;
public class insertAtbottom {
    public static void bottom(Stack<Integer> st , int x){
        if(st.size()==0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        bottom(st,x);
        st.push(top);
    }
    public static void insert(Stack<Integer> st){
        if(st.size()==0) return;
        int x = st.pop();
        insert(st);
        bottom(st,x);
    }
    static void main() {
        System.out.println("This is the original Stack : ");
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        insert(st);
        System.out.println(st);
    }
}
