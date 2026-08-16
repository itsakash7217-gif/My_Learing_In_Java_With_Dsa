package cognizant;
import java.util.*;
public class NumberOfHouses {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] string=s.split("");
        int[] arr=new int[string.length];
        for(int i=0;i<string.length;i++){
            arr[i]=Integer.parseInt(string[i]);
        }
        int count= check(arr,arr.length);
        System.out.println(count);
    }
    static int check(int[] arr,int n){
        int count=0;
        int i =1;
        while(i<=n){
            count++;
            i+=arr[i-1];
        }
        return count;
    }
}
