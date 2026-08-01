package Array;

import java.sql.SQLOutput;
import java.util.*;

public class question12Frequency {
    static int[] frequency(int[] arr ){
        int[] freq = new int[100005];
        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the values of Array: ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int[] FindValue = frequency(arr);
        System.out.print("Enter the finding values: ");
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++){
            int y = sc.nextInt();
        }
        while (n > 0) {
            System.out.print("Cheching the values: " );
            n--;
            int y = sc.nextInt();
            if(FindValue[y]>0){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
