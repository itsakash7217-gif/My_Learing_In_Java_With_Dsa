package oopsClass.inheritance.SingleInheritance;


import oopsClass.inheritance.multiLevelInheritance.human;

class child extends parant{
    String name ;
    child(){
        super();
        this.name ="detault";
    }
    child(String name){
        super();
        this.name=name;
    }
    child(String name,int age){
        super(age);
        this.name=name;

    }

    public static void main(String[] args) {
        human h = new human(2,4);   // works now if constructor is public
        System.out.print(h.age);

        System.out.print(h.height);
    }

}
