package cognizant;

import java.util.Scanner;

public class bill {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int bill=a*100+b*20+c*10;
        System.out.println(bill);
    }
}
