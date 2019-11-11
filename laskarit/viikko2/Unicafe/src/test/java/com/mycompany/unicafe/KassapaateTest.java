/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unicafe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tallbera
 */
public class KassapaateTest {

    Kassapaate kassapaate;
    Maksukortti kortti;

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        kassapaate = new Kassapaate();
        kortti = new Maksukortti(1000);
    }

    @Test
    public void konstruktoriAsettaaSaldotOikein() {

        assertEquals(100000, kassapaate.kassassaRahaa());
        assertEquals(0, kassapaate.maukkaitaLounaitaMyyty());
        assertEquals(0, kassapaate.edullisiaLounaitaMyyty());
    }

    @Test
    public void edullisenLounaanOstoRahaaTarpeeksi() {

        int cash = 300;
        int hinta = 240;
        int erotus = cash - hinta;

        assertEquals(erotus, kassapaate.syoEdullisesti(300));
        assertEquals(100240, kassapaate.kassassaRahaa());
        assertEquals(1, kassapaate.edullisiaLounaitaMyyty());

    }

    @Test
    public void maukkaanLounaanOstoRahaaTarpeesi() {

        assertEquals(500 - 400, kassapaate.syoMaukkaasti(500));
        assertEquals(100400, kassapaate.kassassaRahaa());

        assertEquals(1, kassapaate.maukkaitaLounaitaMyyty());

    }

    @Test
    public void edullisenLounaanOstoEiOnnistu() {

        kassapaate.syoEdullisesti(200);

        assertEquals(100000, kassapaate.kassassaRahaa());
        assertEquals(0, kassapaate.edullisiaLounaitaMyyty());
        assertEquals(200, kassapaate.syoEdullisesti(200));
    }

    @Test
    public void maukkaanLounaanOstoEiOnnistu() {

        kassapaate.syoMaukkaasti(200);

        assertEquals(100000, kassapaate.kassassaRahaa());
        assertEquals(0, kassapaate.maukkaitaLounaitaMyyty());
        assertEquals(200, kassapaate.syoMaukkaasti(200));
    }

    @Test
    public void edullinenLounasKortilla() {

        assertTrue(kassapaate.syoEdullisesti(kortti));
        assertEquals(760, kortti.saldo());
        assertEquals(1, kassapaate.edullisiaLounaitaMyyty());
    }

    @Test
    public void maukasLounasKortilla() {

        assertTrue(kassapaate.syoMaukkaasti(kortti));
        assertEquals(600,kortti.saldo());
        assertEquals(1, kassapaate.maukkaitaLounaitaMyyty());
    }

    @Test
    public void edullinenLounasKortillaEiOnnistu() {
        
        kortti.otaRahaa(800);
        
        
        assertFalse(kassapaate.syoEdullisesti(kortti));
        assertEquals(200, kortti.saldo());
        assertEquals(0, kassapaate.edullisiaLounaitaMyyty());
        
    }
    
        @Test
    public void maukasLounasKortillaEiOnnistu() {
        
        kortti.otaRahaa(800);

        assertFalse(kassapaate.syoMaukkaasti(kortti));
        assertEquals(200,kortti.saldo());
        assertEquals(0, kassapaate.maukkaitaLounaitaMyyty());
    }
    
    
    

    @Test
    public void kortinLataus() {
        
        kassapaate.lataaRahaaKortille(kortti, 1000);
        
        assertEquals(2000,kortti.saldo());
        assertEquals(101000,kassapaate.kassassaRahaa());

    }
    
    @Test
    public void kortinLatausNegatiivinen(){
        kassapaate.lataaRahaaKortille(kortti,-1000);
    
        assertEquals(1000, kortti.saldo());
        assertEquals(100000, kassapaate.kassassaRahaa());
        
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
