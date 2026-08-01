package Stack;
import java.util.*;
public class nextGreatestEle {
    int[] greatest(int[] arr){
        Stack<Integer> a = new Stack<>();
        int[] ans = new int[arr.length];
        ans[arr.length-1]=-1;
        a.push(arr[arr.length-1]);
        for(int i = arr.length-2 ; i >=0 ; i--){
            while(a.size()>0 && arr[i]>a.peek()) {
                a.pop();
            }
            if(arr[i]<a.peek()) ans[i]=a.peek();
            else{
                a.pop();
            }
        }
        return ans;
    }
    void main() {
        int[] arr = {1,3,2,1,8,6,4,1,5};
        int[] ans = greatest(arr);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
