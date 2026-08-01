package JavaInput;
import java.util.Scanner;
public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'b';
        System.out.println("name of the body "+ch);
        int x = (int)ch;// type cast this help to find an ASCII VALUES
        System.out.println(x);
    }
}
