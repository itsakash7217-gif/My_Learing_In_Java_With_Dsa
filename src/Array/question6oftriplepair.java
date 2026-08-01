package Array;

import java.util.Scanner;

public class question6oftriplepair {static void pair(int[] arr, int targate){
    int count=0;
    for(int i =0;i<arr.length;i++) {
        for (int j = i+1; j < arr.length; j++) {
            for (int k = j+2; k < arr.length; k++) {
                if (arr[i] + arr[j] +arr[k]== targate) {
                    System.out.println("pair (" + arr[i] + "," + arr[j] + ","+arr[k]+")");
                    count++;
                }
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

