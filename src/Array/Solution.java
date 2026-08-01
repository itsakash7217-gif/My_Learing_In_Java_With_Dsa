public class Solution {
    static void ArrayPrint(int[][] matrix){
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                System.out.print(matrix[i][j]);
            }
        }
    }
    static int[][] setZeroes(int[][] matrix) {
        int toprow = 0 , bottomrow = matrix.length-1, leftcolumn=0, rightcolumn = matrix.length-1;
        int c = 1 ;
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j]!=0){
                    c++;
                }else{
                    while(c<=matrix.length*matrix.length){}
                    matrix[leftcolumn][j]=0;
                    matrix[i][toprow]=0;
                    c++;
                }
                leftcolumn++;
                toprow++;
            }
        }
        ArrayPrint(matrix);
        return matrix;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);

    }
}
