package cognizant;
import java.util.*;
public class pairSum {
    static void main() {
        Scanner sc =new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            if(hm.containsKey(k-arr[i])){
//                count+=hm.get(k-arr[i]);
                count++;
            }
        }
        for(Map.Entry<Integer,Integer> a : hm.entrySet()){
            System.out.println(a.getKey()+" "+a.getValue());
        }
        //System.out.print(count);
    }
}
