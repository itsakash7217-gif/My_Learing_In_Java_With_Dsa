package JavaInput;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a= 0;
        for(int num=1; num<=n ;num++){
            if(num%2==0){
                a-=num;
            }else {
                a+=num;
            }

        }System.out.println(a);
    }
}
