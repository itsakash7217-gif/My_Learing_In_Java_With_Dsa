package JavaInput;
import java.util.Scanner;
public class squareno {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Learning.first no. :");
     double x = sc.nextDouble();
     System.out.print("Enter second no. :");
     double y = sc.nextDouble();
     double square = x*y;
     System.out.println("Square of two no. : "+square);

    }
}
