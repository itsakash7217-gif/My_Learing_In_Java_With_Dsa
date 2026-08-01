package Array;
class highest{
    void big(){
        int[] no = {1,5,3};
        int a=0;
        for(int i = 0 ; i<no.length; i++) {
            if (a < no[i]){
                a = no[i];}
        }
        System.out.println(a);
    }
}
public class question2highest {
    public static void main(String[] args) {
        highest obj = new highest();
        obj.big();
    }
}
