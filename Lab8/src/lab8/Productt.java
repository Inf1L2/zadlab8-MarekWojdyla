
package lab8;


public abstract class Productt {
    private double price;
    private String name;
    private String describe;

    public Productt(double price, String name, String describe) {
        this.price = price;
        this.name = name;
        this.describe = describe;
    }

    
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
     public String getDescribe(){
        return describe;
    }
    public void setDescribe(String describe){
        this.describe=describe;
    }

    public abstract void buy();

    public abstract void showInfo();


   
    public static void main(String[] args) {
        
    }
    
}
