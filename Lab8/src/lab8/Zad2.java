
package lab8;


public abstract class Zad2 
{
   private String Ksiazka;
   private String dżem;
   private String polopiryna;
   private String długopis;
   private String czekolada;

    public Zad2(String Ksiazka, String dżem, String polopiryna, String długopis, String czekolada) {
        this.Ksiazka = Ksiazka;
        this.dżem = dżem;
        this.polopiryna = polopiryna;
        this.długopis = długopis;
        this.czekolada = czekolada;
    }
   
   
   public String getKsizka() {
        return Ksiazka;
    }

    public void setKsiazka(String Ksiazka) {
        this.Ksiazka = Ksiazka;
    }
    public String getdżem(){
        return dżem;
    }
    public void setdżem(String dżem){
        this.dżem=dżem;
    }
     public String getpolopiryna(){
        return polopiryna;
    }
    public void setpolopiryna(String polopiryna){
        this.polopiryna=polopiryna;
    }
    public String getdługopis ()
    {
        return długopis;
    }
    public void setdługopis(String długopis){
        this.długopis=długopis;
    }
    public String getCzekolada(){
        return czekolada;
    }
    public void setCzekolada(String czekolada){
        this.czekolada=czekolada;
    }
     public abstract void buy();

    public abstract void showInfo();
}
