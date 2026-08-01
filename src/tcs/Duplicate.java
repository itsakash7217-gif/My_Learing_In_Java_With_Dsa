package tcs;
import java.sql.SQLOutput;
import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a = Integer.parseInt(arr[i]);
            if(!map.containsKey(a)) map.put(a,1);
            else map.put(a,map.get(a)+1);
        }
        for(int a : map.keySet()){
            if(map.get(a)>1){
                System.out.println(a);
            }
        }
    }
}
