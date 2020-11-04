package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        Artikl  a = new Artikl("telefon",1000,"1234");
        s.dodajArtikl(a);
        boolean x = s.dodajArtikl(a);
        assertTrue(x);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s= new Supermarket();
        Artikl  a = new Artikl("telefon",1000,"1234");
        s.dodajArtikl(a);
        assertEquals(a,s.izbaciArtiklSaKodom("1234"));
    }
}