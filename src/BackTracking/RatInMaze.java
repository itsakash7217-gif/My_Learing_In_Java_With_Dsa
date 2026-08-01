package BackTracking;

public class RatInMaze {
    static void main() {
        int row = 3;
        int col = 2 ;
     //   int ans = maze(1,1,row,col);
    //    System.out.println(ans);
         way(1,1,row,col,"");
    }
    static void way(int rs, int cs, int re, int ce,String a) {
        if(rs>re || cs>ce) return;
        if (rs == re && cs == ce) {
            System.out.println(a);
            return ;
        }
        way(rs,cs+1,re,ce,a+"R");
        way(rs+1,cs,re,ce,a+"D");
    }
    private static int maze(int rs, int cs, int re, int ce) {
        if (rs > re || rs > ce) return 0;
        if (cs == re && cs == ce) return 1;
        int right = maze(rs,cs+1,re,ce);
        int down = maze(rs+1,cs,re,ce);
        int ans = right+down;
        return ans;
    }
}
