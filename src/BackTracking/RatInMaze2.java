package BackTracking;

public class RatInMaze2 {
    static void main() {
        int row =3;
        int col=2;
        boolean[][] arr = new boolean[row][col];
        multiDirectional(0,0,row-1,col-1,arr,"");
    }
    static void multiDirectional(int i,int j,int row,int col,boolean[][] arr,String s) {
        if(i>row || j>col) return;
        if(i<0 || j<0) return;
        if(arr[i][j]== true) return;
        if(i==row && j==col) {
            System.out.println(s);
            return;
        }
        arr[i][j]=true;
        multiDirectional(i+1,j,row,col,arr,s+"D");
        multiDirectional(i,j+1,row,col,arr,s+"R");
        multiDirectional(i-1,j,row,col,arr,s+"U");
        multiDirectional(i,j-1,row,col,arr,s+"L");
        arr[i][j]=false;
    }
}
//[][]
//[][]
//[][]