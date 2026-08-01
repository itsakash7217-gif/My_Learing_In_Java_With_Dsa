package tcs;

import java.util.Scanner;

public class equlibirium {
    static void main() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n ; i++) {
        arr[i] = sc.nextInt();
        }
    int total = 0;
    for(int i = 0 ; i < n ; i++) {
        total+=arr[i];
    }
    boolean flag = false;
    int left = 0;
    for(int i = 0 ; i < n ; i++) {
        int right =total-arr[i]-left;
        if(right==left){
            System.out.println(i);
            flag = true;
            break;
        }
        left+=arr[i];
    }
    if(!flag){
        System.out.print(-1);
    }
    }
}
