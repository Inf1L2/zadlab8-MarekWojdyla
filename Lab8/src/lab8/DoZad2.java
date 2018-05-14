
package lab8;


public class DoZad2 extends Zad2{
    private String ubrania;
    private String lekarstwa;
    private String narzedzia;
    
    public DoZad2(String Ksiazka, String dżem, String polopiryna, String długopis, String czekolada) {
        super(Ksiazka, dżem, polopiryna, długopis, czekolada);
        this.lekarstwa=lekarstwa;
        this.narzedzia=narzedzia;
        this.ubrania=ubrania;
    }
    public void buy () {
        System.out.println(
        "I bought a black tractor, capaciticy 2400!"
                + "I bought a black tractor, capaciticy 2400!");
    }
    public void showInfo() {
        System.out.println(
        "Ksiazka:" + getKsizka()
        + " dżem:" + getdżem()
        + " polopiryna:" + getpolopiryna()
        + "długopis:" +  getdługopis()
        + "Czekolada:" +getCzekolada()        
                       
        );
    }
    
}
