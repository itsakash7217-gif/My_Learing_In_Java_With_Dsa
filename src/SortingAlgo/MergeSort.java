package SortingAlgo;
public class MergeSort {
    public static void mergesort(int[] arr,int l ,int r){
        if(l>=r) return;
        int mid = (l+r)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    public static void merge(int[] arr, int l , int mid , int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] a = new int[n1];
         int i,j,k;
        for(i = 0 ; i < n1;i++) a[i]=arr[l+i];
        int[] b = new int[n2];
        for(j = 0 ; j < n2;j++) b[j]=arr[mid+j+1];

        i = 0 ;
        j = 0 ;
        k = l ;
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
                arr[k++]=a[i++];
            }else{
                arr[k++]=b[j++];
            }
        }
        while(i<n1){
            arr[k++]=a[i++];
        }
        while(j<n2){
            arr[k++]=b[j++];
        }
    }
    public static void display(int[] arr){
        for(int a:arr){
            System.out.print(a);
        }
    }
    static void main() {
        int[] arr = {5, 4, 3, 2, 8, 1, 4};
        System.out.println("original array: ");
        display(arr);
        int l = 0;
        int r = arr.length;
        System.out.println();
        System.out.println("after mergesort: ");
        mergesort(arr, l, r - 1);

        display(arr);
    }
}
