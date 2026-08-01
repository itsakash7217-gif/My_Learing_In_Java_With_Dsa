package SortingAlgo;
import java.util.*;
public class CountSort {
    public int findmax(int[] arr){
        int max = 0 ;
        for(int i = 0 ;i<arr.length ; i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public int[] countsortInorder(int[] arr){
        int max = findmax(arr);
        int[] fre = new int[max+1];
        for(int a : arr){
            fre[a]++;
        }
        for(int i = 1 ; i < fre.length;i++){
            fre[i]+=fre[i-1];
        }
        int y = fre.length-1;
        int[] ans = new int[arr.length];
        int x = 0 ;
        for(int i = arr.length-1 ; i>=0 ;i--){
            ans[fre[arr[i]]-1]=arr[i];
            fre[arr[i]]--;
        }
        return ans;
    }
    public void countsort(int[] arr){
        int max =findmax(arr);
        int[] fre = new int[max+1];
        for(int a : arr){
            fre[a]++;
        }
        int x = 0 ;
        for(int i = 0 ; i <fre.length;i++){
                while(fre[i]>0){
                    arr[x++]=i;
                    fre[i]--;
                }
        }
    }
    void main() {
        int[] arr = {7,3,2,8,7,6,5,4,2};
        countsort(arr);
        System.out.println(" This is the simple sorted array ");
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println(" ");
        int[] arr1 = {6,5,3,8,7,5,3,3,2,1,6,1};
        int[] ans =countsortInorder(arr1);
        System.out.println(" This is the inplace sorted array ");
            System.out.print(Arrays.toString(ans));

    }
}
