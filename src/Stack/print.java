package Stack;

import java.util.Scanner;
import java.util.Stack;

public class print {
    static void main() {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the stack: ");
        int n = sc.nextInt();
        System.out.println("Elements of the stack :");
        for(int  i = 0 ; i < n ;i++){
            st.push(sc.nextInt());
        }
        System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            int x = rt.peek();
            System.out.print(x+" ");
            st.push(x);
            rt.pop();
        }
    }
}
