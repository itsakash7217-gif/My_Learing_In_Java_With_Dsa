package Accenture;
import java.util.*;
public class SecondHeighOddEven {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        System.out.print("Total sum of 2nd largest of even and odd : "+(even.get(even.size()-2)+odd.get(odd.size()-2)));
    }
}
