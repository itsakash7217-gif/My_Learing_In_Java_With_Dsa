package Learning;

import java.util.Scanner;

public class BreakKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int num = 1;
        while(true){
            if(num%5==0 && num%7==0){
                break;
            }
            System.out.println(num);
            num++;
        }
//        while(true){
//
//            if (num%5==0 && num%7==0) {
//                System.out.println(num);
//
//               break;
//            }
//            num++;
////        for(int num = 0 ; num <=n ; n++){
////            if(num%5==0 && num%7==0) break;
////            System.out.println(num);
//        }
//
////num++;
    }
}
