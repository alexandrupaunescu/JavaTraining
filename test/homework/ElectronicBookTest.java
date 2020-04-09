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
public class ElectronicBookTest {
    
    public ElectronicBookTest() {
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
     * Test of printBook method, of class ElectronicBook.
     */
    @Test
    public void testPrintBook() {
        System.out.println("printBook");
        ElectronicBook instance = new ElectronicBook();
        instance.printBook();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class ElectronicBook.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        ElectronicBook instance = new ElectronicBook();
        String expResult = instance.getTitle();
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getISBN method, of class ElectronicBook.
     */
    @Test
    public void testGetISBN() {
        System.out.println("getISBN");
        ElectronicBook instance = new ElectronicBook();
        String expResult =instance.getISBN();
        String result = instance.getISBN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAutors method, of class ElectronicBook.
     */
    @Test
    public void testGetAutors() {
        System.out.println("getAutors");
        ElectronicBook instance = new ElectronicBook();
        LinkedList<String> expResult = null;
        LinkedList<String> result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDownloadLinks method, of class ElectronicBook.
     */
    @Test
    public void testGetDownloadLinks() {
        System.out.println("getDownloadLinks");
        ElectronicBook instance = new ElectronicBook();
        LinkedList<String> expResult = null;
        LinkedList<String> result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRemarksAndNotes method, of class ElectronicBook.
     */
    @Test
    public void testGetRemarksAndNotes() {
        System.out.println("getRemarksAndNotes");
        ElectronicBook instance = new ElectronicBook();
        LinkedList<String> expResult = null;
        LinkedList<String> result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPublisher method, of class ElectronicBook.
     */
    @Test
    public void testGetPublisher() {
        System.out.println("getPublisher");
        ElectronicBook instance = new ElectronicBook();
        String expResult =instance.getPublisher();
        String result = instance.getPublisher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class ElectronicBook.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ElectronicBook instance = new ElectronicBook();
        float expResult = 0.0F;
        float result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getElectronicFormat method, of class ElectronicBook.
     */
    @Test
    public void testGetElectronicFormat() {
        System.out.println("getElectronicFormat");
        ElectronicBook instance = new ElectronicBook();
        ElectronicBook.FormatOfElectronicBook expResult = null;
        ElectronicBook.FormatOfElectronicBook result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getYearOfPublicatiob method, of class ElectronicBook.
     */
    @Test
    public void testGetYearOfPublicatiob() {
        System.out.println("getYearOfPublicatiob");
        ElectronicBook instance = new ElectronicBook();
        ElectronicBook.YearOfPublication expResult = null;
        ElectronicBook.YearOfPublication result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class ElectronicBook.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        ElectronicBook instance = new ElectronicBook();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setISBN method, of class ElectronicBook.
     */
    @Test
    public void testSetISBN() {
        System.out.println("setISBN");
        String ISBN = "";
        ElectronicBook instance = new ElectronicBook();
        instance.setISBN(ISBN);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRemarksAndNotes method, of class ElectronicBook.
     */
    @Test
    public void testSetRemarksAndNotes() {
        System.out.println("setRemarksAndNotes");
        LinkedList<String> remarksAndNotes = null;
        ElectronicBook instance = new ElectronicBook();
        instance.setRemarksAndNotes(remarksAndNotes);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPublisher method, of class ElectronicBook.
     */
    @Test
    public void testSetPublisher() {
        System.out.println("setPublisher");
        String publisher = "";
        ElectronicBook instance = new ElectronicBook();
        instance.setPublisher(publisher);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class ElectronicBook.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float price = 0.0F;
        ElectronicBook instance = new ElectronicBook();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setYearOfPublicatiob method, of class ElectronicBook.
     */
    @Test
    public void testSetYearOfPublicatiob() {
        System.out.println("setYearOfPublicatiob");
        ElectronicBook.YearOfPublication yearOfPublicatiob = null;
        ElectronicBook instance = new ElectronicBook();
        instance.setYearOfPublicatiob(yearOfPublicatiob);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
