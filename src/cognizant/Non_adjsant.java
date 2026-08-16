package cognizant;

import java.util.Scanner;

public class Non_adjsant {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = check(arr,n);
        System.out.println(max);
    }
    public static  int check(int[] arr,int n){
        int pre2 =0;
        int pre1 =arr[0];
        for(int i=1;i<n;i++){
            int take = arr[i]+pre2;
            int tak1 = pre1;
            int curr = Math.max(take,tak1);
            pre2=pre1;
            pre1=curr;
        }
        return pre1;
    }
}
