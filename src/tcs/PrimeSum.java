package tcs;

import java.util.Scanner;

public class PrimeSum {
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        boolean flag = false;
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                System.out.println(i);
                sum+=i;
                if(sum==n){
                    flag=true;
                    System.out.print("Yes");
                    break;
                }
                if(sum>n){
                    break;

                }
            }
        }
        if(!flag){
            System.out.print("No");
        }
    }
}
//2 3 5 7
