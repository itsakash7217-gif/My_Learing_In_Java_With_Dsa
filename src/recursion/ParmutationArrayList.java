package recursion;

import java.sql.Array;
import java.util.*;

public class ParmutationArrayList {
    static void main() {
        int[] arr = {1,2,3};
        List<List<Integer>> list = possibleWay(arr);
        System.out.println(list);
        System.out.println("Second ");
        List<List<Integer>> a = secondway(arr);
        System.out.println(a);
    }
    static List<List<Integer>> secondway(int[] arr) {
        List<List<Integer>> x = new ArrayList<>();
        way(arr,x,0);
        return x;
    }
    static void way(int[] arr, List<List<Integer>> x,int p) {
        if(p==arr.length-1){
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                l.add(arr[i]);
            }
            x.add(l);
            return;
        }
        for(int i = p ; i < arr.length ; i++){
            swap(arr,i,p);
            way(arr,x,p+1);
            swap(arr,i,p);
        }
    }
    static void swap(int[] arr , int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static List<List<Integer>> possibleWay(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        boolean[] a = new boolean[arr.length];
        System.out.println("First way but take Space complexity;");
        way(arr,list,list1,a);
        return list;
    }
    static void way(int[] arr, List<List<Integer>> list, List<Integer> list1, boolean[] a) {
        if(list1.size()==arr.length){
            list.add(new ArrayList<>(list1));
            return;
        }
        for(int i=0;i<arr.length;i++) {
            if(a[i]==false) {
            list1.add(arr[i]);
            a[i] = true;
            way(arr,list,list1,a);

            a[i] = false;
            list1.remove(list1.size()-1);
            }
        }
    }
}
