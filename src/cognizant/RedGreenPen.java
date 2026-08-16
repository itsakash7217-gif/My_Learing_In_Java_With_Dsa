package cognizant;

import java.util.Scanner;

public class RedGreenPen {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = gtor(arr,n);
        System.out.println(count);
    }
    static int gtor(int[] arr,int n){
        int count = 0;
        for(int i=1;i<n;i++){
            if(arr[i-1]%2!=0 && arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
