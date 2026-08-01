package Akash.Rapid;

public class add {
    public String step_1 = "public member";
    void insidetheclass(){
        System.out.println("with in class"  +step_1);
    }
    public static void main(String[] args) {
        add obj =new add();
        obj.insidetheclass();
        System.out.println("with in class"  +obj.step_1);
        add2 obj2 = new add2();
        obj2.outsidetheclass();


    }
}
class add2{
    void outsidetheclass(){
        add obj = new add();
        System.out.println("out side of class"+ "with in class" +obj.step_1);
    }
}
