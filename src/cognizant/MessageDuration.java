package cognizant;

import java.util.*;

public class MessageDuration {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();
        }
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = sc.next();
        }
        int k = sc.nextInt();
        boolean[] ans = valid(arr,s,n,k);
        System.out.println(Arrays.toString(ans));
    }
    static boolean[] valid(int[] arr, String[] s, int n, int k){
        HashMap<String,Integer> map = new HashMap<>();
        boolean[] ans = new boolean[n];
        for(int i=0;i<n;i++){
            if(!map.containsKey(s[i])){
                map.put(s[i],arr[i]);
                ans[i]=true;
            }else{
                if(Math.abs(arr[i]-map.get(s[i]))>k){
                    ans[i]=true;
                    map.put(s[i],arr[i]);
                }else{
                    ans[i]=false;
                }
            }
        }
        return ans;
    }
}
