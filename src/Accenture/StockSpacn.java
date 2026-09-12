package Accenture;
import java.util.*;
public class StockSpacn {
    static void main() {
//        optimized method now with the use of stack with o(n)
        Scanner sc  =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int[] growth = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                s.push(i);
            }
            growth[i]=i-s.peek();
            s.push(i);
        }
        System.out.println(Arrays.toString(growth));
        sc.close();
//        this is the brute force method with time complexity of o(n^2)
//        Scanner sc  =  new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0 ; i < n ; i++){
//            arr[i] = sc.nextInt();
//        }
//        int[] growth = new int[n];
//        for(int i = 0 ; i < n ; i++){
//            int count = 0 ;
//            int temp = arr[i];
//            for(int j = i  ; j >= 0 ; j--){
//                if(j<0) break;
//                if(temp<arr[j]) break;
//
//                if(arr[j]<=temp){
//                    count++;
//                }
//                growth[i] = count;
//            }
//        }
//        System.out.println(Arrays.toString(growth));
//        sc.close();
    }
}
//        7
//        100 80 60 70 60 75 85
//        [1, 1, 1, 2, 1, 4, 6]