package Array;
class add{
    void ijn(){
        int[] abc = {5,3,1};
        int a =0;
        for(int i=0;i<abc.length;i++){
            a+= abc[i];
        }
        System.out.println(a);
    }
}
public class question1add {
    public static void main(String[] args) {
        add obj = new add();
        obj.ijn();
    }
}
