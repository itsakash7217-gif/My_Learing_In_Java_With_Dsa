package Array;
class abc{
    void Array2d(){
        int[][] ages = {{2,5,8},{6,78,6},{6,4}};
        for(int i= 0; i< ages.length; i++){
            for(int j = 0 ; j<ages[i].length; j++) {
                System.out.println(ages[i][j]);
            }
        }
    }
}

public class array2d  {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.Array2d();
    }
}
