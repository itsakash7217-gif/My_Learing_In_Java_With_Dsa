import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1 ;
        int sum = 0 ;
        int n = sc.nextInt();
        while (num<=n) {
            sum = sum +num;
//            System.out.println(num);
            num++;
        }
        System.out.println("sum of Learning.first n natural n number: " +sum);
 //       float sum = (n*(n+1))/2;
 //       System.out.println("Sum of Learning.first n natural number: " +sum);
    }
}
