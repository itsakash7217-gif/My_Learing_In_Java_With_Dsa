package oopsClass;

public class Lambda {
    public static void main(String[] args) {
        Operation sum =(a,b)->a+b;
        Operation sub =(a,b)->a-b;
        Operation prod =(a,b)->a*b;
        Lambda l = new Lambda();// lambda function is function to be in single line (assign a variables) and the type always interface ;
        System.out.println(l.check(1,3,sum));
        System.out.println(l.check(1,3,sub));
        System.out.println(l.check(1,3,prod));

    }
    int check(int a ,int b,Operation op){
        return op.operation(a,b);
    }

}
interface Operation{
    int operation(int a,int b);
}
