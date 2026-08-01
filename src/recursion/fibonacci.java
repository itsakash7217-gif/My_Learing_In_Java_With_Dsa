package recursion;

import java.util.Scanner;

public class fibonacci {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            System.out.println(F(n));

    }
    static int F(int n){
        if(n==0 || n==1) return 1;
        return F(n-1)+F(n-2);
    }
}
