package Stack;
import java.util.*;
public class insertanyval {
    static void main() {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the stack: ");
        int n = sc.nextInt();
        System.out.println("Elements of the stack :");
        for(int  i = 0 ; i < n ;i++){
            st.push(sc.nextInt());
        }
        System.out.println("Original stack :");
        System.out.println(st);
        int a = 10;
        System.out.print("Position os the new element to insert to input position :");
        int position = sc.nextInt();
        Stack<Integer> rt = new Stack<>();
        while(st.size()>=position){
            rt.push(st.pop());
        }
        st.push(a);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println("After the insertion of the element :");
        System.out.println(st);
    }
}
