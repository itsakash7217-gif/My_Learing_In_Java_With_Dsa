package oopsClass;

public  class makeans {
    String name;
     int rno;
    private double persentage;

    public makeans(){

    }

    public makeans(String name , int rno , double persentage){
        this.name=name;
        this.rno=rno;
        this.persentage=persentage;
    }

    public double getPersentage(){
        return persentage;
    }

    public void setPersentage(double persentage){
        this.persentage = persentage;
    }

}
