package JavaInput;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int num =0;
        for(; n>0;){
            a=n%10;
            num=num*10+a;

            n/=10;
        }
        System.out.println(num);

//        int num=0;
//        int a = 0 ;
//        while(n>0){
//
//            a=n%10;
//
//            num=num*10+a;
//            n/=10;
//
//
//        }
//        System.out.println(num);
    }
}
