package ba.unsa.etf.rpr;

public class Korpa {
  

  private Artikl[] artikli;
  private int brArtikala;
  private int max;
  
  public Korpa(){
    max=50;
    brArtikala=0;
    artikli = new Artikl[max];
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
  
  public int dajUkupnuCijenuArtikala(){
    int cijena = 0;
    if(brArtikala == 0) return 0;
    for(int i = 0; i < brArtikala; i++){
      cijena += artikli[i].getCijena();
    }
    return cijena;
  } 
  
}
