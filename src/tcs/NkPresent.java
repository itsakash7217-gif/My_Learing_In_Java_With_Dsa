package tcs;

import java.util.HashMap;
import java.util.Scanner;

public class NkPresent {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int a =sc.nextInt();
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        boolean flag=false;
        for(int key:hm.keySet()){
            if(hm.get(key)>=Math.ceil(n/3)){
                flag=true;
                System.out.println(key);
            }
        }
        if(!flag){
            System.out.print("No");
        }
    }
}
