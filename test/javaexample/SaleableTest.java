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
public class SaleableTest {
    
    public SaleableTest() {
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
     * Test of getSalePrice method, of class Saleable.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        Saleable instance = new SaleableImpl();
        float expResult = instance.getSalePrice();
        float result = instance.getSalePrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class SaleableImpl implements Saleable {

        public float getSalePrice() {
            return 0.0F;
        }
    }
    
}
