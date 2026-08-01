package Array;
import java.util.*;
public class question5ofpair {
    static void pair(int[] arr,int targate){
        int count=0;
        for(int i =0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]+arr[j]==targate){
                    System.out.println("pair (" + arr[i]+","+arr[j]+ ")");
                    count++;
                }
            }
        }
        System.out.println("no. of pair occur: " +targate+ " =>" +count);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size =sc.nextInt();
        int[] arr =new int[size];
        System.out.println("Elementes of array : ");
        for(int i =0; i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("target value: ");
        int targate= sc.nextInt();
        pair(arr, targate);
    }
}
