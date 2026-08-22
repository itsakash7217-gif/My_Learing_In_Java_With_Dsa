package oopsClass.inheritance.multiLevelInheritance;

class sample extends human {
    String name;
    String gender;
    sample(){
        this.name="non";
        this.gender="other";
    }
    sample(String name , String gender,int height){
        super(height);
        this.name=name;
        this.gender=gender;
    }
    sample(String name,String gender){
        this.name=name;
        this.gender=gender;
    }
    sample(int h,int w,int a,String name){
        super(h,w,a);
        this.name=name;

    }
    sample(int height,int age,String name){
        super(height,age);
        this.name=name;

    }

}
