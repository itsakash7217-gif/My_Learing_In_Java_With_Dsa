package oopsClass;

class Human{
        String name;
        int age;
        static long population;
        Human(String name,int age){
            this.name=name;
            this.age=age;
            Human.population+=1;
        }
    }


public class staticInClass {
    static void main() {
        Human akash = new Human("akash",25);
        Human raj = new Human("raj",25);

        System.out.print(Human.population);

    }
}
