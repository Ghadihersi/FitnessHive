/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesshive;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ghadihersi
 */
public class ClientTest {
    
    public ClientTest() {
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
     * Test of getAge method, of class Client.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Client instance = new Client(21,"female",155,65.0,1);
        int expResult = 21;
        int result = instance.getAge();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAge method, of class Client.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        Client instance = new Client(21,"female",155,65.0,1);
        instance.setAge(age);
        
    }

    /**
     * Test of getGender method, of class Client.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Client instance = new Client(21,"female",155,65.0,1);
        String expResult = "female";
        String result = instance.getGender();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setGender method, of class Client.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "female";
        Client instance = new Client(21,"female",155,65.0,1);
        instance.setGender(gender);
        
    }

    /**
     * Test of getHeight method, of class Client.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        Client instance = new Client();
        double expResult = 0.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setHeight method, of class Client.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 0.0;
        Client instance = new Client(21,"female",155,65.0,1);
        instance.setHeight(height);
        
    }

    /**
     * Test of getWeight method, of class Client.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Client instance = new Client(21,"female",155,65.0,1);
        double expResult = 65.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
       ;
    }

    /**
     * Test of setWeight method, of class Client.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        double weight = 0.0;
        Client instance = new Client(21,"female",155,65.0,1);
        instance.setWeight(weight);
      
    }

 

    /**
     * Test of makeSubscrption method, of class Client.
     */
    @Test
    public void testMakeSubscrption() {
        System.out.println("makeSubscrption");
        Client instance = new Client(21,"female",155,65.0,1);
        instance.setAge(25);
        int expResult = 25;
        int result = instance.getAge();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of choose_schedule method, of class Client.
     */
    @Test
    public void testChoose_schedule() {
        System.out.println("choose_schedule");
        Client instance = new Client(21,"female",155,65.0,1);
        instance.setAge(21);
        int expResult = 21;
        int result = instance.getAge();
        assertEquals(expResult, result);
        
        
    }
    
}
 
    
    

