package JavaInput;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int a = 1; a<=n ; a++){
            for(int b = 1 ; b<=m ; b++){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
