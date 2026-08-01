
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt();
        if(ans%2==0 && ans%3==0){
            System.out.println("answer: " +ans);
        }else{
            System.out.println("not");
        }
    }
}
