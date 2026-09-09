package Accenture;
import java.util.Scanner;
public class GoogleNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        sc.close();
        int sum = 0 ;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        boolean flag = true;
        for(int i=2;i<=Math.sqrt(sum) ; i++){
            if(sum%i==0){
                flag = false;
            }
        }
        if(flag){
            System.out.println("Google number");
        }else{
            System.out.println("Not a Google number");
        }
    }
}
