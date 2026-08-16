package cognizant;
import java.util.*;
public class paliLength {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++) {
            char xx = s.charAt(i);
            arr[i]=xx-'a'+1;
        }
        int total=0;
        for(int i = arr.length-1;i>=0;i--){
            total+=arr[i];

        }

        boolean flag = true;
        int left=0;
        for(int i = 0;i<arr.length-1;i++){
            int right = total-left-arr[i];
            if(right==left){
                flag = false;
                System.out.println(i);
            }
            left+=arr[i];
        }
        if(flag){
            System.out.println("no");
        }
    }
}
