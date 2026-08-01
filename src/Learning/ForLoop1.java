package Learning;

import java.util.Scanner;
public class ForLoop1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for (int num = n; num >=0 ;num--) {//init statement; command; final expression all three are optional it can code in loop or out in loop
            System.out.println(num);
        }
    }
}
