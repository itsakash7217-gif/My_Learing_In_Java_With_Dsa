package JavaInput;
import java.util.Scanner;
public class ififelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        if (in < 20) {
            if (in < 10) {//condition apply again under if
                System.out.println("less");
            } else {
                System.out.println("more");
            }
        } else {
            System.out.println("most");
        }
    }
}
