package JavaInput;
import java.util.Scanner;
public class Questionif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        if(in%2==0 && in%3==0){
            System.out.println("divisible by 3");
        }else{
            System.out.println("not divisible by 3");
        }
    }
}
