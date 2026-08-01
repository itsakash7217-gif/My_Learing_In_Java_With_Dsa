package JavaInput;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int a = 1 ; a<=n ; a++){
            for(int b = 1 ; b<=m ; b++){
                if((a+b)%2==0)
                System.out.print(1);
                else
                    System.out.print(2);
            }
            System.out.println();
        }
    }
}
