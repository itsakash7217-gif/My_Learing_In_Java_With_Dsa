package JavaInput;
import java.util.Scanner;
public class Qjuestion10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int a = 1 ; a<=n ; a++){
            for(int b = n ; b>=a ; b-=1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
