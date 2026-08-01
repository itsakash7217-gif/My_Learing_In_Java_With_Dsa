package Array;
import java.util.*;
public class FindRoom {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int ans=0;
            for(int j=i;j<n;j++){
                ans+=arr[j];
                if(ans==m){
                    System.out.printf("Strating room %d and last room %d",i+1,j+1);
                    i=n;

                }
            }
        }
    }
}
