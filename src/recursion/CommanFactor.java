package recursion;

import java.util.Scanner;

public class CommanFactor {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value Of A : ");
        int a = sc.nextInt();
        System.out.print("Enter the K value : ");
        int b = sc.nextInt();
        System.out.println("Final Answer : ");
        System.out.println(Com(a,b));
    }
    static int Com(int a, int b){
        if (b == 0)
            return a;
        return Com(b, a % b);

//     if(a%b>=0){
//         if(a%b==0) return b;
//         Com(a,b-1);
//     }
//        if(b%a>=0){
//            if(b%a==0) return a;
//            Com(a-1,b);
//        }
//     return 1;
    }
}
