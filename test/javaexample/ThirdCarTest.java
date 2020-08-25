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
public class ThirdCarTest {
    
    public ThirdCarTest() {
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
     * Test of getSalePrice method, of class ThirdCar.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        ThirdCar instance = new ThirdCar();
        float expResult = instance.getSalePrice();
        float result = instance.getSalePrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class ThirdCar.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ThirdCar instance = new ThirdCar();
        String expResult = instance.getName();
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class ThirdCar.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        ThirdCar instance = new ThirdCar();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class ThirdCar.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        ThirdCar instance = new ThirdCar();
        ThirdCar.Color expResult = null;
        ThirdCar.Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class ThirdCar.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        ThirdCar.Color color = null;
        ThirdCar instance = new ThirdCar();
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class ThirdCar.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        ThirdCar instance = new ThirdCar();
        short expResult = 0;
        short result = instance.getSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class ThirdCar.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        short speed = 0;
        ThirdCar instance = new ThirdCar();
        instance.setSpeed(speed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
