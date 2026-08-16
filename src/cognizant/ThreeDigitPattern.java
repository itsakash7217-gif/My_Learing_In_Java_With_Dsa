package cognizant;

import java.util.Scanner;

public class ThreeDigitPattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0 ;
//        while(i<=j){
//            sum+=i++;
//        }
//        j=j-1;
//        while(j>=k){
//            sum+=j--;
//        }

        sum +=((((i+j)*(j-i+1))/2)+(((k+j-1)*(j-k))/2));
        System.out.print(sum);
    }
}
