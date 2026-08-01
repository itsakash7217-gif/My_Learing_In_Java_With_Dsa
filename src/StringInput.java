import java.util.*;
public class StringInput {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr=s.split(",");
        int[][] nums = new int[2][2];
        int x = 0;
        for(int i=0;i<2;i++){
            for(int j = 0 ; j < 2;j++){
                nums[i][j]=Integer.parseInt(arr[x++]);
            }
        }
        System.out.println(Arrays.deepToString(nums));
//        s=s.replaceAll("\\[|\\]","");
//
//        String[] arr = s.split("");
//        System.out.println(arr.length);
//        System.out.print(Arrays.toString(arr));
//        int[] num = new int[arr.length];
//        int x = 0;
//        for(int i=0;i<arr.length;i++){
//            num[0]=Integer.parseInt(arr[i]);
//            System.out.println(num[x]   +" ");
//        }
    }
}
