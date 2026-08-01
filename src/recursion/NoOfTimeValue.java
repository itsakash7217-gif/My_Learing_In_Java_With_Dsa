package recursion;

import java.util.*;

public class NoOfTimeValue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the ARRAY: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Elements of the array: ");
        for(int i = 0 ; i < n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value that you want : ");
        int x=sc.nextInt();
        System.out.println(Find(arr,x,0));

    }
    static ArrayList<Integer> Find(int[] arr , int x ,int n){
        ArrayList<Integer> ans = new ArrayList<>();
        if(n>=arr.length) return ans;
        if(arr[n]==x){
            ans.add(n);
        }
        ArrayList<Integer> Small = Find(arr,x,n+1);
        ans.addAll(Small);
        return ans;
    }
}
