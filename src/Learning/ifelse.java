package Learning;

import java.util.Scanner;
public class ifelse {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2 ==0) {
            System.out.println("a is completely Divide");
        } else {
            System.out.println("not dividual");
        }
    }
}
