package SystemDesignSolid;
import java.util.*;
class product{
    private String item;
    private double price;
    product(String item,int price){
        this.item=item;
        this.price=price;
    }
    public String getItem(){
        return item;
    }
    public double getPrice(){
        return price;
    }
}
class cart{
    ArrayList<product> data = new ArrayList<>();
    public void add(product p){
        data.add(p);
    }
    public void remove(product p){
        data.remove(p);
    }
    public List<product> getProduct(){
        return data;
    }
    public double total(){
        return data.stream().mapToDouble(product::getPrice).sum();
    }
}
class inVoice{
    public void print(cart c){
        System.out.println("Product"+"      |      "+"item");
        for(product p : c.getProduct()){
            System.out.println(p.getItem()+"      |      "+p.getPrice());
        }
        System.out.println("This is the total price of your added product: "+c.total());
    }
}
class save{
    public void dataBase(cart c){
        System.out.print("Your products are saved in DataBase");
    }
}
public class SingleResponsibilityPrinciple {
    void main() {
        cart mine = new cart();
        mine.add(new product("Bgmi",5500));
        mine.add(new product("call Of Duty",5000));
        mine.add(new product("ScoopCast",1000));
        mine.add(new product("MOC",2500));
        inVoice check = new inVoice();
        check.print(mine);
        save my = new save();
        my.dataBase(mine);
    }
}
