package JavaInput;
import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        String money;
        money = (in <=100) ? "low" : "high";
        System.out.println(money);
    }
}
