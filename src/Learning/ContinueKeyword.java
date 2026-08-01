package Learning;

import java.util.Scanner;

public class ContinueKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        while(num<=n){
            if(num%3==0){
                num++;
                continue;
            }
            System.out.println(num);
            num++;
        }
//        for (int num = 1; num <= n; num++){
//            if(num%3==0){
//                continue;
//            }
//            System.out.println(num);
//        }
    }
}
