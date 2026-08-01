package tcs;
import java.util.*;
public class MeanMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        while(sc.hasNextInt()){
            al.add(sc.nextInt());
        }
        int[] arr=al.stream().mapToInt(i->i).toArray();
        findMM(arr,arr.length);
    }
    static void findMM(int[] arr,int n){
        Arrays.sort(arr);
        int x=0;
        for(int a:arr){
            x+=a;
        }
        float mean = (float)x/n;
        System.out.printf("This is the mean %.2f of this array.\n",mean);
        if(n%2==0){
            float median=(arr[n/2-1]+arr[n/2])/2.0f;
            System.out.printf("Median of the array are %.2f ",median);
        }else{

            System.out.printf("This is the median %.2f of the Array",(float)arr[n/2]);
        }
    }
}
