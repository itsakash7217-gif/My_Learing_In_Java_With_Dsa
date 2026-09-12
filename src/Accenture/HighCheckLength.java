package Accenture;
import java.util.*;
public class HighCheckLength {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int greater = 1;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i-1]){
                greater++;
            }
            else{
                greater = 1;
            }
            max = Math.max(max,greater);
        }
        System.out.println(max);
        sc.close();
    }
}
