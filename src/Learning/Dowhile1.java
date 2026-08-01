package Learning;

import java.util.Scanner;

public class Dowhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int sum=0;
        do{
            System.out.println(sum);
            num++;
            sum = sum +num;
        }while(num<=n);

    }
}
