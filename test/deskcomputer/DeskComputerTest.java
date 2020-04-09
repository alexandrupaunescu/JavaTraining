/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deskcomputer;

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
public class DeskComputerTest {
    
    public DeskComputerTest() {
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
     * Test of getCd method, of class DeskComputer.
     */
    @Test
    public void testGetCd() {
        System.out.println("getCd");
        DeskComputer instance = new DeskComputer();
        DeskComputerDisplay expResult = instance.cd;
        DeskComputerDisplay result = instance.getCd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pushKey method, of class DeskComputer.
     */
    @Test
    public void testPushKey() {
        System.out.println("pushKey");
        DeskComputerButton.ButtonMarkups pushedButtonMarkup = null;
        DeskComputer instance = new DeskComputer();
        instance.pushKey(pushedButtonMarkup);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
