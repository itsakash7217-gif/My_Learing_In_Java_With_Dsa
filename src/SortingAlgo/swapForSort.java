package SortingAlgo;

public class swapForSort {
    public static void swap(int[] arr ,int x, int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void sort(int[] arr){
        int x = -1;
        int y = -1;
        for(int i = 1 ; i<arr.length;i++){
            if(arr[i]<arr[i-1]) {
                if (x == -1) {
                    x=i-1;
                 //   y=i;
                }else{
                    y=i;
                }
            }
        }
        swap(arr,x,y);
    }
    static void main() {
        int[] arr = {1,5,2,3,1,8,9};
        sort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
