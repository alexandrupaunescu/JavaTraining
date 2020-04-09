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
public class SecondCarTest {
    
    public SecondCarTest() {
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
     * Test of getSalePrice method, of class SecondCar.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        SecondCar instance = new SecondCar();
        float expResult = instance.getSalePrice();
        float result = instance.getSalePrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class SecondCar.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        SecondCar instance = new SecondCar();
        String expResult = instance.getName();
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class SecondCar.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        SecondCar instance = new SecondCar();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class SecondCar.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        SecondCar instance = new SecondCar();
        SecondCar.Color expResult = null;
        SecondCar.Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class SecondCar.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        SecondCar.Color color = null;
        SecondCar instance = new SecondCar();
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class SecondCar.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        SecondCar instance = new SecondCar();
        short expResult = 0;
        short result = instance.getSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class SecondCar.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        short speed = 0;
        SecondCar instance = new SecondCar();
        instance.setSpeed(speed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
