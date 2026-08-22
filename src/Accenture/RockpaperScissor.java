package Accenture;
import java.util.Scanner;
public class RockpaperScissor {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        if(m.startsWith("r")){
            System.out.print("paper");

        }else if(m.startsWith("s")){
            System.out.print("rock");
        }else{
            System.out.print("scissor");
        }
    }
}
