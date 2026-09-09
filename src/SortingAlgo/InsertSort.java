package SortingAlgo;

public class InsertSort {
    public static void insert(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    static void main() {
        int[] arr = {8,5,3,9,7,4};
        insert(arr);
        for(int a :  arr){
            System.out.print(a+" ");
        }
    }
}
