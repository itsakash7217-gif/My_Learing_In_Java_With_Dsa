package Array;
class abcd{
    void arrAy3Dghg(){
//        int[][][] ages =new int[2][3][2];
        int[][][] ages = {{{1},{1}},{{9},{15}}};
    for(int i = 0; i<ages.length; i++){
        for(int j=0; j<ages[i].length; j++){
            for(int k =0; k<ages[j].length; k++){
                System.out.println(ages[i][j][k]);
            }
        }
    }
    }
}
public class array3d {
    public static void main(String[] args) {
        abcd obj = new abcd();
        obj.arrAy3Dghg();
    }
}
