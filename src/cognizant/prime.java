package cognizant;

import java.util.Scanner;

public class prime {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag =false;
        if(num<2){
            flag=true;
            System.out.print("Not prime");
        }

        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                flag=true;
                System.out.print("Not prime");
            }
        }
        if(!flag){
            System.out.print("Prime");
        }
    }
}
