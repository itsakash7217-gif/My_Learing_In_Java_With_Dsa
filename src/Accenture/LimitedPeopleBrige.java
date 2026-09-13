package Accenture;
import java.util.*;
    class pair{
        int a;
        int b;
        public pair(int a, int b){
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "pair [a=" + a + ", b=" + b + "]";
        }
    }
public class LimitedPeopleBrige {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr = new int[n][3];
        List<pair> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            int a = arr[i][0] +arr[i][2];

            int t = i;
            for(int j = i+1; j < n; j++) {
                if(a>=arr[j][0]){
                    a=arr[j][0]+arr[j][2];
                }else{
                    t=j-1;
                    break;
                }
            }
            ans.add(new pair(arr[i][0],a));
            i=t;
            System.out.println(ans);
        }
        int sum = 0 ;
        for(pair p : ans){
            int a =p.b-p.a+1;
            sum+=a;
        }
        System.out.println(sum);
    }
}
//5
//        1 2 3
//        3 4 2
//        6 3 2
//        9 3 2
//        11 3 2
//        [pair [a=1, b=5]]
//        [pair [a=1, b=5], pair [a=6, b=8]]
//        [pair [a=1, b=5], pair [a=6, b=8], pair [a=9, b=13]]
//        13