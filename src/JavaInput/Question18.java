package JavaInput;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_number = sc.nextInt();
        int unit = 0;

        for(int power = 1; binary_number > 0; power*=2){
            int ans = binary_number%10;
            unit+= ans*power;
            binary_number/=10;
        }
        System.out.println(unit);
//        while(binary_number>0) {
//            int ans = binary_number%10;
//            unit+= ans*power;
//            binary_number/=10;
//            power*=2;
//        }
//        System.out.println(" Binary number to Real number conversion: " +unit);
    }
}
