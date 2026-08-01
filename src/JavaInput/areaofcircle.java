package JavaInput;// javainput nam ke folder me ye code likh rhe  he
import java.util.Scanner;//import java.util.Scanner;and Scanner sc = new Scanner(System.in);use hoge input lene ke liye
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// use to take input
        int radius;
        radius = sc.nextInt();
        double pi = 3.1415;
        double area = pi*radius*radius;
        System.out.println("The area of circle is : "+area);

    }
}
