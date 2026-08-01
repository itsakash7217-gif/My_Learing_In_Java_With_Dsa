package JavaInput;
import java.util.Scanner;
public class q2if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        if(in%3 == 0 || in%5 == 0){
            System.out.println("number is divible by both 3 or 5");
        }
    }
}
