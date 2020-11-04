package ba.unsa.etf.rpr;

public class Supermarket {
  
  private int max;
  private Artikl[] artikli;
  private int brArtikala;
  
   public Supermarket(){
    max=1000;
    artikli = new Artikl[max];
    brArtikala=0;    
  }
  
  public boolean dodajArtikl(Artikl a){
    if(brArtikala == max) return false;
    else {
      artikli[brArtikala] = a;
      brArtikala++;
      return true;
    }    
  }
  
  public Artikl[] getArtikl(){
    return artikli;
  }
  
  public Artikl izbaciArtiklSaKodom(String kod){
    Artikl n = null;
    for(int i=0;i<artikli.length;i++){
      if(artikli[i]!=null && artikli[i].getKod().equals(kod)){
        n=artikli[i];
        artikli[i] = null;
        break;
      }
    }
    return n;
  }
  
  
  
  
}
