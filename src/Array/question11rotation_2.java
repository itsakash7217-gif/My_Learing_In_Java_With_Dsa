package Array;

import java.util.*;

public class question11rotation_2 {
    static int[] reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("K time rotation: ");
        int k = sc.nextInt();
        k = k % n; // handle cases where k > n

        // 🔄 Step-by-step rotation
        reverse(arr, 0, n - k - 1);     // Reverse Learning.first part
        reverse(arr, n - k, n - 1);     // Reverse second part
        reverse(arr, 0, n - 1);         // Reverse whole array

        System.out.println("Rotated array:");
        System.out.println(Arrays.toString(arr));
    }
}