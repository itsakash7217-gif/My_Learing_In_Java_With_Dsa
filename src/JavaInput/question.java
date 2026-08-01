package JavaInput;
import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//int num=0;
//        for(;n>0;num++){
//            n = n/10;
//
//        }
//        System.out.println("number of digits: " +num);
//
//    }
//}
//        int num = 0;
//        while (n > 0) {
//            n = n / 10;
//            num++;
//        }
//        System.out.println("number digit: " + num);
        int num =0;
        int Number = n;
        do{
            n=n/10;
            num++;

        }while(n>0);
        System.out.println("Number of Digits: " +Number+ "=" +num);
    }
}
