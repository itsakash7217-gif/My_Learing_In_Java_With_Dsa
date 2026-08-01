package JavaInput;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int a = 1 ; a<=n ; a++){
            for(int b = a ; b<=n ; b++){
                System.out.print(b);
            }
            for(int c = 0 ; c<a-1 ; c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
