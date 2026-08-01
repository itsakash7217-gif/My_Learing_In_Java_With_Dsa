package JavaInput;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
//        int num = 0;
//        while(n>0){
//            num+=n%10;
//            n/=10;
//
//        }
//        System.out.println(num);
        int num =0;
//        for(; n>0; n/=10){
//            num+=n%10;
//
//
//        }
//        System.out.println(num);
        do{
           num+=n%10;
           n=n/10;

        }while(n>0);
        System.out.println(num);
    }
}
