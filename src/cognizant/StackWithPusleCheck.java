package cognizant;

import java.util.*;

public class StackWithPusleCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[]  arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        int count= 0;
        for(int i = 0 ; i < arr.length ; i++){

                    while(!st.isEmpty() && arr[i]>st.peek()){
                        st.pop();
                        count++;
                    }
                    st.push(arr[i]);


        }
        System.out.println(count);
    }
}
