package oopsClass.inheritance.multiLevelInheritance;
class person extends sample {
    int salary;
    String status;
    String location;
    person(){
        super();
        this.salary=0;
        this.status="";
        this.location="";
    }
    person(int height,int age,String name,int salary,String status,String location){
        super(height,age,name);
        this.salary=salary;
        this.status=status;
        this.location=location;
    }
}
