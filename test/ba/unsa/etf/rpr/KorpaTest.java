package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        Artikl  a = new Artikl("telefon",1000,"1234");
        korpa.dodajArtikl(a);
        boolean x = korpa.dodajArtikl(a);
        assertTrue(x);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa= new Korpa();
        Artikl  a = new Artikl("telefon",1000,"1234");
        korpa.dodajArtikl(a);
        assertEquals(a,korpa.izbaciArtiklSaKodom("1234"));
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        Artikl  a = new Artikl("telefon",1000,"1234");
        Artikl  b = new Artikl("tablet",1000,"1284");
        korpa.dodajArtikl(a);
        korpa.dodajArtikl(b);
        assertEquals(2000,korpa.dajUkupnuCijenuArtikala());
    }
}