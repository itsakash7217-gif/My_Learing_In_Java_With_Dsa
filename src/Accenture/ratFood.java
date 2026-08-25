package Accenture;
import java.util.Scanner;
public class ratFood {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit =sc.nextInt();
        r*=unit;
        int h = sc.nextInt();
        int[] house = new int[h];
        int count=0;
        int sum=0;
        for(int i=0;i<h;i++){
            house[i] = sc.nextInt();
            if(r>=sum){
            sum+=house[i];
                count++;
            }
        }
        if(r<=sum){
            System.out.print(count);
        }else if (r>sum){
            System.out.println(0);
        }else if(h==0){
            System.out.println(-1);
        }
    }
}
