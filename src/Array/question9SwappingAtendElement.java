package Array;
import java.util.* ;
public class question9SwappingAtendElement{
    static int[] Exchange(int[] arr , int i, int j) {
        int p = arr[i];
        arr[i] = arr[j];
        arr[j] = p;
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array :");
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the elements of Array :");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int i =0;
        int j =arr.length-1;

        while(i<j) {
            arr =Exchange(arr, i, j);
            i++;
            j--;
        }
        System.out.println("After the exachanging the extrime end Elements to Each other");
        System.out.println(Arrays.toString(arr));
    }
}
