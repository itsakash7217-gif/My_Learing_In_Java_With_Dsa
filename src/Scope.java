class abc{
    void xyz() {
        int a = 10;
        int b = 20;
        System.out.println(a + " " + b);
        for (int i = 0; i <= 2; i++) {
            int h=0;
            System.out.println(b);
        }
       int c=9;
        System.out.println(c);
    }
        int z(int v){
        v+=v;
        return v;
    }

}
public class Scope{
    public static void main(String[] args){
        abc obj = new abc();
        obj.xyz();
        int c=90;
        System.out.println(obj.z(90));
        System.out.println("xxxxxxx");
    }
}

