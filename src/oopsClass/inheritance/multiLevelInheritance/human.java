package oopsClass.inheritance.multiLevelInheritance;

public class human {
    public int height;
    int weight;
    public int age;  // with private access modifier we can only access with in the same class

 public human() {
        this.height = -1;
        this.weight = -1;
        this.age = -1;
    }
public human(int height,int age){
        this.height = height;
        this.age = age;
}
   public human(int height) {
        this.height = height;
//        this.height = 90;
//        this.age = 77 ;
    }

    human(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

}
