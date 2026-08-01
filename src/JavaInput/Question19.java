package JavaInput;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int ans = 0;
        int power = 1;
        while(decimal>0){
            int a = decimal%2;
            ans+=a*power;
            decimal/=2;
            power*=10;
        }
        System.out.println(ans);
    }
}
