package JavaInput;
import java.net.SocketOption;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of principle");
        float p = sc.nextFloat();
        System.out.print("Enter the value of rate of intrest");
        float r = sc.nextFloat();
        System.out.print("Enyter the value of time");
        float t = sc.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("Princile: " + p);
        System.out.println("Rate: " + r);
        System.out.println("Time: " + t);
        System.out.println("The value of simpleIntrest: " + si);
    }
}
