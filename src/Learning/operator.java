package Learning;

import java.util.Scanner;
public class operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Arithmetic Learning.operator
        System.out.println("Enter the Learning.first value");
        float a = sc.nextFloat();
        System.out.println("Enter the second value");
        float b = sc.nextFloat();
        float x = a+b;
        System.out.println("Sum of the two values: " +x);
        float y = a-b;
        System.out.println("Substraction of two values: " +y);
        float z = a*b;
        System.out.println("multiplication of the two values: " +z);
        float u = a/b;
        System.out.println("quotient of the value: " +u);
        float v = a%b;
        System.out.println("remainder of the value: " +v);
        a++;
        System.out.println("value of the a: " +a);
        b--;
        System.out.println("value of the b: " +b);
        System.out.println(a==b);

    }
}
