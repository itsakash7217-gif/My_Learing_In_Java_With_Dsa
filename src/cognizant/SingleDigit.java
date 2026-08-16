package cognizant;
import java.util.*;
public class SingleDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
//        ArrayList<Integer> arr = new ArrayList<>();
        while(n>=10){
            int sum=0;
            while(n>0){
                int a = n%10;
                sum+=a;
//                arr.add(a);
                n/=10;
            }
//            for(int ele : arr){
//                sum+=ele;
////                System.out.print(sum+" ");
//            }
//            arr.removeAll(arr);
            n=sum;
        }
        System.out.print(n);
    }
}
