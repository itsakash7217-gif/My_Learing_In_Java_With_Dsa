package SortingAlgo;

public class QuickSort {
    public static int partition(int[] arr , int start , int end){
        int part = arr[start];
        int count = 0 ;
        for(int i  = start+1 ; i <= end; i++){
            if(arr[i]<=part) count++;
        }
        int pivot = start+count;
        swap(arr,start,pivot);
        int a = start ;
        int b = end ;
        while(a < pivot && b > pivot){
            while(a < pivot && arr[a]<=part) a++;
            while(b > pivot && arr[b]>part) b--;
            if(a<pivot && b>pivot){
                swap(arr,a,b);
                a++;
                b--;
            }
        }
        return pivot;
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]=temp;
    }
    public static void quicksort(int[] arr, int start , int end){
        if(start>=end) return;
        int pivot = partition(arr ,start,end);
        quicksort(arr,start,pivot-1);
        quicksort(arr,pivot+1,end);
    }
    static void main() {
        int[] arr = {4,5,2,1,6,7,3,3,2,4,8,9,99,9};
        int start = 0 ;
        int end = arr.length-1;
        System.out.println("Original arr ");
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("After sort");
        quicksort(arr,start,end);
        for(int b : arr){
            System.out.print(b+" ");
        }
    }
}
