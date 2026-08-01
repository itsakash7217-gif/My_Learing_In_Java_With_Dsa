package recursion;

import java.util.*;

public class Exist {
    static boolean exist(int[] arr, int n ,int k){
        if(n==arr.length) return false;
        if(arr[n]==k) return true;
        return exist(arr,n+1,k);
    }
    static int index(int[] arr , int n , int k){
        if(n>=arr.length) return -1;
        if(arr[n]==k) return n;
        return index(arr,n+1,k);
    }
    static ArrayList<Integer> Allindex(int[] arr, int n , int k){
        ArrayList<Integer> al = new ArrayList<>();
        if(n>=arr.length) return al;
        if(arr[n]==k) al.add(n);
        ArrayList<Integer>  ar = Allindex(arr,n+1,k);
        al.addAll(ar);
        return al;
    }
    static boolean sort(int[] arr, int n){
        if(n==arr.length-1) return true;
        if(arr[n]>arr[n+1]) return false;
        return sort(arr,n+1);

    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++) {
            arr[i]=sc.nextInt();
        }
        if(exist(arr,0,k)) System.out.println("yes");
        else System.out.println("no");
        System.out.println("idex exist:");
        System.out.println(index(arr,0,k));
        System.out.println("All Index os the array: ");
        ArrayList<Integer> ans = Allindex(arr,0,k);
        for(Integer a : ans){
        System.out.print(a);
        }
        System.out.println("is this array is Sorted or not: ");
        System.out.print(sort(arr,0));
    }
}
