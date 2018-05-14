
package lab8;


public class Rower extends Productt{

    private String model;

    public Rower(String model, double price, String name, String describe) {
        super(price, name, describe);
        this.model = model;
    }
    
 
    public void buy () {
        System.out.println(
        "I bought a black tractor, capaciticy 2400!");
    }
    public void showInfo() {
        System.out.println(
        "Price:" + getPrice()
        + " name:" + getName()
        + " describe:" + getDescribe()
        );
    }
}

    

