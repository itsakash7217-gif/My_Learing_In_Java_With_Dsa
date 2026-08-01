package Array;

public class missingrepeat {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 2};
        System.out.println(find(arr));
    }
        static String find(int[]arr){
        int x = arr.length+1;
        int[] a = new int[x];
        for(int value : arr){
            a[value]++;
        }
        int missing =-1;
        int repeating =-1;
        for(int i = 1 ; i<x;i++) {
            if (a[i] == 0) {
                missing = i;
            } else if (a[i] > 1) {
                repeating = i;
            }
        }
        return "Missing" +missing + " repeating" +repeating;
    }
}
