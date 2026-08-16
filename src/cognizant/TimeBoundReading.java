package cognizant;

import java.util.*;

public class TimeBoundReading {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count= 0;
        int time=0;
        for(int arr_i = 0; arr_i < n; arr_i++){
            if(arr[arr_i]<=m-time){
                count++;
                time+=arr[arr_i];
            }
        }
        System.out.print(count);
    }
}
