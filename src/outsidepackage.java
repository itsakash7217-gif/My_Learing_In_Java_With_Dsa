import Akash.Rapid.add;
import org.w3c.dom.ls.LSOutput;

public class outsidepackage {
    public static void main(String[] args) {
        add obj = new add();
        System.out.println("out side the package" +obj.step_1);
        add3 obj3  = new add3();
        System.out.println("outside package in class" +obj.step_1);
    }
}
class add3 extends add{
    void outsidepackage(){
        add3 obj = new add3();
        System.out.println("out side the clsss child class" + obj.step_1);
    }
}