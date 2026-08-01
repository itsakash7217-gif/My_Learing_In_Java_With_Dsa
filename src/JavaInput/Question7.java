package JavaInput;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int num = 1; num<=n; num++){
            for(int j = 1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
