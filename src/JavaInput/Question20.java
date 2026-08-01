package JavaInput;
import java.util.Scanner;

class Algebra{
    int sum(int a , int b){
        int sum = a+b;
        return sum;
    }
}

public class Question20 {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of the two values");
        int ans = obj.sum(x,y);
        System.out.println(ans);
    }
}
