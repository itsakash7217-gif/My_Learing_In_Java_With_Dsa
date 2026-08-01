package Stack;
import java.util.*;
public class removeDuplicate {
    public static int[] remove(int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++) {
            int a = arr[i];
            if (st.size() == 0 || st.peek() != arr[i]) st.push(arr[i]);
            else if (st.peek() == arr[i]) {
                if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                    st.pop();
                }
            }
        }
            int[] arr1 = new int[st.size()];
            int n = arr1.length;
            for(int i = 0 ; i < n ; i++) {
                arr1[i] = st.pop();

        }
        return arr1;
    }
    static void main() {
        int[] arr = {1,3,3,3,2,2,5,6,6,7,9,9,9,5,5,4};
        int[] ans = remove(arr);
        for(int a : ans){
            System.out.print(a+" ");
        }
    }
}
