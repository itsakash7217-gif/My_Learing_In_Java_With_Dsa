package Accenture;

import java.util.Scanner;

public class SameValueCantiner {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0 ;
        int i = 0;
        while(i<n){
            int check = arr[i];
            int t = 0 ;
            while(i<n && check==arr[i]){
                t++;
                i++;
            }
            if(check==t) count++;
        }
        System.out.println(count);
    }
}
