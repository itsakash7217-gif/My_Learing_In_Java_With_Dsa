package Accenture;
import java.util.*;
public class greatEleToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i]=sc.nextInt();
        }
        int count = check(arr,n);
        System.out.print(count);
    }
    public static int check(int[] arr,int n){
        Stack<Integer> st = new Stack<>();
        int count=0;
        for(int i =  0 ; i < n ; i++){
            if(st.isEmpty()) st.push(arr[i]);
            else{
                while(!st.isEmpty() && st.peek()<arr[i]) st.pop();
                st.push(arr[i]);
            }
        }
        while(!st.isEmpty()){
            count++;
            st.pop();
        }
        return count;
    }
}
