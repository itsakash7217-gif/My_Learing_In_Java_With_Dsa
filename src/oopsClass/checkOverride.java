package oopsClass;
class Tuman{
    String name;
    int age;
    Tuman(String name){
        this.name=name;

    }
    @Override
    public String toString() {
        return name;
    }

}
public class checkOverride {
    static void main() {
        Tuman a =new Tuman("a");
        Tuman b =new Tuman("b");
        System.out.println(a);
        System.out.println(b);
    }
}
