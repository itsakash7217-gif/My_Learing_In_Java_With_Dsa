package Array;

public class question7ofswapping {
    static void Swapping(int a , int b){
        a = a+b;
        b = a-b;
        a =a -b;
        System.out.println("after the swapping the value a :" +a);
        System.out.println("after the swapping the value b :" +b);
    }
    public static void main(String[] args){
        int a = 5;
        int b = 9;
        System.out.println("initial value of a:" +a);
        System.out.println("initial value of b:" +b);
        Swapping(a,b);
//        int c = a; // We may use temperary variable to swapping the values.
//        a= b;
        //b = c;
//        System.out.println("after swapping ths value of a :" +a);
//        System.out.println("after swapping ths value of b :" +b);
    }
}
