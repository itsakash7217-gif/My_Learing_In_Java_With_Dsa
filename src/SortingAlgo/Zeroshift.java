package SortingAlgo;

public class Zeroshift {
    public static void shiftZeros(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1 ; i++){
            for(int j = 0 ; j < n-1-i ;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void main() {
        int[] arr = {0,5,0,2,34,0,0,0,3,5};
        shiftZeros(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}
