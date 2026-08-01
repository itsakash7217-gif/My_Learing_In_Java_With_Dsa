package BackTracking;
import java.util.*;
public class RatInMaze3 {
    static void main() {
        int row = 3;
        int col = 3;
        int[][] arr = {{1,0,1},{1,0,1},{1,1,1}};
        conditionToMove(0,0,row-1,col-1,arr,"");
    }
    static void conditionToMove(int i,int j,int row,int col,int[][] arr,String s){
        if(i>row || j>col) return;
        if(i<0 || j<0) return;

        if(arr[i][j]==-1) return;
        if(arr[i][j]==0)return;
        if(i==row && j==col){
            System.out.println(s+" ");
            return;
        }
        arr[i][j]=-1;
        conditionToMove(i,j+1,row,col,arr,s+'R');
        conditionToMove(i+1,j,row,col,arr,s+'D');
        conditionToMove(i,j-1,row,col,arr,s+'L');
        conditionToMove(i-1,j,row,col,arr,s+'U');
        arr[i][j]=1;
    }
}
