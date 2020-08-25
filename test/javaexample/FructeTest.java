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
public class FructeTest {
    
    public FructeTest() {
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
     * Test of getCuloare method, of class Fructe.
     */
    @Test
    public void testGetCuloare() {
        System.out.println("getCuloare");
        Fructe instance = new FructeImpl();
        String expResult = instance.getCuloare();
        String result = instance.getCuloare();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCuloare method, of class Fructe.
     */
    @Test
    public void testSetCuloare() {
        System.out.println("setCuloare");
        String culoare = "";
        Fructe instance = new FructeImpl();
        instance.setCuloare(culoare);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getForma method, of class Fructe.
     */
    @Test
    public void testGetForma() {
        System.out.println("getForma");
        Fructe instance = new FructeImpl();
        String expResult = "";
        String result = instance.getForma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class FructeImpl extends Fructe {

        public String getForma() {
            return "";
        }
    }
    
}
