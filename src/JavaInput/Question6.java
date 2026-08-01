package JavaInput;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=1;
        System.out.print("Enter the a value: ");
        int a = sc.nextInt();
        System.out.print("Enter the b value: ");
        int b = sc.nextInt();
        int ans = 1;
        while(x<=b){
             ans=a*ans;
            x++;

        }
        System.out.println("a^b: " +ans);
    }
}
