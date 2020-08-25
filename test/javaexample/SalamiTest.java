/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dinamo
 */
public class SalamiTest {
    
    public SalamiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSalePrice method, of class Salami.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        Salami instance = new Salami();
        float expResult = 0.0F;
        float result = 0.0F;
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPriceOfSalami method, of class Salami.
     */
    @Test
    public void testGetPriceOfSalami() {
        System.out.println("getPriceOfSalami");
        Salami instance = new Salami();
        float expResult = 0.0F;
        float result = 0.0F;
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPriceOfSalami method, of class Salami.
     */
    @Test
    public void testSetPriceOfSalami() {
        System.out.println("setPriceOfSalami");
        float priceOfSalami = 0.0F;
        Salami instance = new Salami();
        instance.setPriceOfSalami(priceOfSalami);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGust method, of class Salami.
     */
    @Test
    public void testGetGust() {
        System.out.println("getGust");
        Salami instance = new Salami();
        Salami.Taste expResult = null;
        Salami.Taste result = instance.getGust();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGust method, of class Salami.
     */
    @Test
    public void testSetGust() {
        System.out.println("setGust");
        Salami.Taste gust = null;
        Salami instance = new Salami();
        instance.setGust(gust);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
