package Array;

import java.util.Arrays;

public class question4copy {
    static void xyz(int[] arr){
        for(int i =0; i < arr.length; i++){
            arr[i]=0;
          //  System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 9;
        arr[1] = 5;
        arr[2] = 99;
        arr[3] = 95;
        arr[4] = 8;
        xyz(arr);
     //   System.out.println(" ");
//        int[] arr_2 = arr;// copy technice is shellow type and it chnages original value . this is happed because of sharing same address of data in hesh memory;
        //int[] arr_2 = arr.clone();//in clone techine the hesh memory is seperate and store in different location
//
//        arr_2[0]=2;
//        arr_2[1]=25;
        int[] arr_2 = arr;
        xyz(arr_2);
        for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i]);
            double y =9;
            double a = Math.sqrt(y);
            System.out.println(a);
        }
    }
}
