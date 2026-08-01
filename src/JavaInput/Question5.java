package JavaInput;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a=1;
        int num = 1;
        do{
            a=a*num;

            System.out.println("Factorial of the no." + num + " is " + a);
            num++;


        }while(num<=n);

//        while(num<=n){
//            a=a*num;
//            num++;
//        }
//        System.out.println("Factorial of the given number: " + a);
//        int a =1;
//        for(int num = 1; num<=n; num++){
//            a=a*num;
//
//        }
//        System.out.println("Factorial of the Given Number: " + a);

    }
}
