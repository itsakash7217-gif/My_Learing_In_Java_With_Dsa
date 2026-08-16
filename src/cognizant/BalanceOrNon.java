package cognizant;
import java.util.*;
public class BalanceOrNon {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int n = number.length();
        if(n%2==0) {
            System.out.println("Not Balanced");
        }else{
            int mid =n/2;
            int left=0;
            int right=0;
            for(int i = 0 ; i<mid ; i++){
                left+=Character.getNumericValue(number.charAt(i));
            }
            for(int i = n-1 ; i>mid ; i--){
                right+=Character.getNumericValue(number.charAt(i));
            }
            if(left==right){
                System.out.println("Balanced");
            }else{
                System.out.println("Not Balanced");
            }
        }
    }
}
