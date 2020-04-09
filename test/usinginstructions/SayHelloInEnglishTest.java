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
public class SayHelloInEnglishTest {
    
    public SayHelloInEnglishTest() {
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
     * Test of sayHello method, of class SayHelloInEnglish.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        SayHelloInEnglish instance = new SayHelloInEnglish();
        instance.sayHello();
        // TODO review the generated test code and remove the default call to fail.
        //ail("The test case is a prototype.");
    }
    
}
