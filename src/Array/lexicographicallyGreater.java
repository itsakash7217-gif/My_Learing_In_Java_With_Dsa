package Array;
import java.util.*;
public class lexicographicallyGreater {
        public void nextPermutation(int[] nums) {
            int a=0, last=nums.length-1 ;
            while(last>=0){
                if(nums[last]<nums[last-1]){
                    last--;
                }
            }
            if(last>0){
                int last2=nums.length-2;
                while(nums[last2]<nums[last]){
                    a=nums[last];
                    nums[last]=nums[last2];
                    nums[last2]=a;
                    break;
                }
            }
        }
    void main() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        nextPermutation(nums);
    }
}
