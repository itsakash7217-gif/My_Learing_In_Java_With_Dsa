package cognizant;
import java.util.Scanner;
public class iSumipuls2isEqualIplus1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0 ; i < n ; i++){
            num[i]=sc.nextInt();
        }
        double count=0;
        for(int i = 0 ; i < n-2 ; i++){
            if(num[i]+num[i+2]==num[i+1]){
                count++;
            }
        }
        System.out.printf("%.2f this is the total count of with sliding of 3 windo size ",count);
    }

}
