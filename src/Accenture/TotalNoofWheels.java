package Accenture;
import java.util.Scanner;
public class TotalNoofWheels {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int v =sc.nextInt();
        int w =sc.nextInt();

        int tw = (4*v-w)/2;
        int fw = (w-2*v)/2;
        System.out.print("Total no. of Tw :"+tw+"\nTotal no. of Fw:"+fw);
    }
}
