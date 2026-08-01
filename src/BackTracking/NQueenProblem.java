package BackTracking;

public class NQueenProblem {
    static void main() {
        int n = 6;
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
                arr[i][j] = 'X';
            }
        }
        nQeen(arr,0);
    }
    static void nQeen(char[][] arr,int row){
        int n = arr.length;
        if(row==n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int i=0;i<n;i++){
                if(isCheck(arr,row,i)){
                    arr[row][i] = 'Q';
                    nQeen(arr,row+1);
                    arr[row][i] = 'X';
                }
        }
        return;
    }
    static boolean isCheck(char[][] arr,int row,int i){
        int n= arr.length;
        //left to right
        for(int a = 0 ; a < n ;a++){
            if(arr[row][a]=='Q'){
                return false;
            }
        }
        //top to bottom
        for(int a = 0 ; a < n ; a++){
           if(arr[a][i]=='Q'){
               return false;
           }
        }
        // North East
        int x = row;
        int y = i;
        while(x>=0 && y< n){
            if(arr[x--][y++]=='Q'){
                return false;
            }
        }
        // South East
        x = row;
        y = i;
        while(x<n && y< n){
            if(arr[x++][y++]=='Q'){
                return false;
            }
        }
        // South West
        x = row;
        y = i;
        while(x<n && y>=0){
            if(arr[x++][y--]=='Q'){
                return false;
            }
        }
        // North West
        x = row;
        y = i;
        while(x>=0 && y>=0){
            if(arr[x--][y--]=='Q') {
                return false;
            }
        }
        return true;
    }
}
