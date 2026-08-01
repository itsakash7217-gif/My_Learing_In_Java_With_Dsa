package HashMap;
import java.util.*;
public class MaxElement  {
    static void main() {
        Map<Integer,Integer> mp = new HashMap<>();
        int[] arr = {2,3,4,5,2,1,1,4,5,6,7,1,1,2,2,3,4,5,1};
        for(int i : arr){
            if(!mp.containsKey(i)){
                mp.put(i,1);
            }else{
                int a = mp.get(i);
                mp.put(i,a+1);
            }
        }
        int max = -1;
        int val = -1;
        for(int a : mp.keySet()){
            if(mp.get(a)>max){
                max=mp.get(a);
                val=a;
            }
        }
        System.out.println(mp);
        System.out.printf("This is the value [%d] that have heighest frequency is : [%d]\n", val,max);
    }
}
