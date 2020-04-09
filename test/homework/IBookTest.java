/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.LinkedList;
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
public class IBookTest {
    
    public IBookTest() {
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
     * Test of getListOfReadingDevices method, of class IBook.
     */
    @Test
    public void testGetListOfReadingDevices() {
        System.out.println("getListOfReadingDevices");
        IBook instance = new IBook();
        LinkedList<ElectronicBook.ElectronicBookReader> expResult =  instance.getListOfReadingDevices();
        LinkedList<ElectronicBook.ElectronicBookReader> result = instance.getListOfReadingDevices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of printBook method, of class IBook.
     */
    @Test
    public void testPrintBook() {
        System.out.println("printBook");
        IBook instance = new IBook();
        instance.printBook();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
