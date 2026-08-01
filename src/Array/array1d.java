package Array;
class ArrAy{
    void SingleArray(){
        int[] ages = new int[3];
        float[] weight = new float[3];
        String[] name = new String[3];
        ages[0]=1;
        ages[1]=13;
        ages[2]=10;
        for(int i=0; i<ages.length ; i++ ){
            System.out.println(ages[i]);
        }
//        ages[0]=1;
//        ages[1]=13;
//        ages[2]=10;
//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);
        weight[0]=29.3f;
        weight[1]=65.3f;
        weight[2]=75.3f;
        int i =0;
        while(i<weight.length){
            System.out.println(weight[i]);
            i++;

        }
//        System.out.println(weight[0]);
//        System.out.println(weight[1]);
//        System.out.println(weight[2]);
        name[0]="Akash";
        name[1]="Ankit";
        name[2]="adaras";
        int j=0;
        do{
            System.out.println(name[j]);
            j++;
        } while(j<name.length);
//        System.out.println(name[0]);
//        System.out.println(name[1]);
//        System.out.println(name[2]);



    }
}
public class array1d {
    public static void main(String[] args) {
        ArrAy obj = new ArrAy();
        obj.SingleArray();
    }
}
