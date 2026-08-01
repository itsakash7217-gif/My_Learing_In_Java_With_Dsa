package recursion;

import java.util.Scanner;

public class AlternetSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value Of A : ");
        int a = sc.nextInt();
        System.out.println("Final answer : " +Sum(a));
    }
    static int Sum(int a){
        if(a==0) return 0;
        if(a%2==0) return Sum(a-1)-a;
        else return Sum(a-1)+a;
    }
}
