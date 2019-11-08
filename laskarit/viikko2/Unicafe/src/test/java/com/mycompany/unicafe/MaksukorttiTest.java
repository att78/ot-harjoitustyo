package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;
    

    @Before
    public void setUp() {
        kortti = new Maksukortti(1000);
        
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    
    
    
    @Test
    public void konstruktoriAsettaaSaldonOikein() {
        
        assertEquals(1000, kortti.saldo());
        assertEquals("saldo: 10.0", kortti.toString());
    }
    
    @Test
    public void rahanOttaminenVahentaaSaldoa() {
        kortti.otaRahaa(400);
        assertEquals("saldo: 6.0", kortti.toString());
    }
    
     @Test
    public void kortilleVoiLadataRahaa() {
        kortti.lataaRahaa(2500);
        assertEquals("saldo: 35.0", kortti.toString());
    }
    
         @Test
    public void saldoEiMuutu() {        
        kortti.otaRahaa(10000);
        assertEquals("saldo: 10.0", kortti.toString());
    }
    
    
        
         @Test
    public void metodinPalautusFalse() {
        
        
        assertEquals(false, kortti.otaRahaa(10000));
    }
    
        
        
         @Test
    public void metodinPalautusTrue() {
        
        
        assertEquals(true, kortti.otaRahaa(100));
    }

    

    
    
}
