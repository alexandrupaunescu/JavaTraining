/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usinginstructions;

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
public class SayHelloTest {
    
    public SayHelloTest() {
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
     * Test of displayLine method, of class SayHello.
     */
    @Test
    public void testDisplayLine() {
        System.out.println("displayLine");
        SayHello instance = new SayHelloImpl();
        instance.displayLine();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of sayHello method, of class SayHello.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        SayHello instance = new SayHelloImpl();
        instance.sayHello();
        // TODO review the generated test code and remove the default call to fail.
        //ail("The test case is a prototype.");
    }

    public class SayHelloImpl extends SayHello {

        public void sayHello() {
        }
    }
    
}
