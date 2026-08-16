package cognizant;
import java.util.*;
public class fistRepeatIndex {
    static void main() {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> m = new HashMap<>();
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }
        for(int i = 0 ; i <  n ; i++){
            if(m.get(arr[i])>1){
//                m.remove(arr[i]);
                System.out.print(i);
                break;
            }
        }
    }
}
