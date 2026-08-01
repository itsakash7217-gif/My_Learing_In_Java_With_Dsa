
import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
int po=1;
        for(int i=0 ; i<b ; i++){
           po *=a;

        }
        System.out.println(po);
    }
}
