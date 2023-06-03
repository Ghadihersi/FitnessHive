/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesshive;

import java.util.Date;
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
public class SubscribeTest {
    
    public SubscribeTest() {
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

    @Test
    public void testGetPkg1() {
        System.out.println("getPkg1");
        Subscribe instance = new Subscribe(21,"3 Months, 300 SR","6 Month, 500 SR", "1 Year, 900 SR");
        String expResult = "3 Months, 300 SR";
        String result = instance.getPkg1();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testSetPkg1() {
        System.out.println("setPkg1");
        String pkg1 = "";
        Subscribe instance = new Subscribe();
        instance.setPkg1(pkg1);
      
    }

 
    @Test
    public void testGetPkg2() {
        System.out.println("getPkg2");
        Subscribe instance = new Subscribe(21,"3 Months, 300 SR","6 Month, 500 SR", "1 Year, 900 SR");
        String expResult = "6 Month, 500 SR";
        String result = instance.getPkg2();
        assertEquals(expResult, result);
       
    }

  
    @Test
    public void testSetPkg2() {
        System.out.println("setPkg2");
        String pkg2 = "";
        Subscribe instance = new Subscribe();
        instance.setPkg2(pkg2);
      
    }

   
    @Test
    public void testGetPkg3() {
        System.out.println("getPkg3");
        Subscribe instance = new Subscribe(21,"3 Months, 300 SR","6 Month, 500 SR", "1 Year, 900 SR");
        String expResult = "1 Year, 900 SR";
        String result = instance.getPkg3();
        assertEquals(expResult, result);
        
    }

    
    @Test
    public void testSetPkg3() {
        System.out.println("setPkg3");
        String pkg3 = "";
        Subscribe instance = new Subscribe();
        instance.setPkg3(pkg3);
       
    }

   
  
    

   
    @Test
    public void testGetClientID() {
        System.out.println("getClientID");
        Subscribe instance = new Subscribe();
        int expResult = 0;
        int result = instance.getClientID();
        assertEquals(expResult, result);
      
    }

    
    @Test
    public void testSetClientID() {
        System.out.println("setClientID");
        int ClientID = 0;
        Subscribe instance = new Subscribe();
        instance.setClientID(ClientID);
      
    }

   
    @Test
    public void testExpirationDate() {
        System.out.println("ExpirationDate");
        String pkg = "1 Year, 900 SR";
        Subscribe instance = new Subscribe();
        String expResult = "01/06/2024";
        String result = instance.ExpirationDate(pkg);
        assertEquals(expResult, result);
        
    }

   
    @Test
    public void testPrintSubscrbtionInfo() {
        System.out.println("printSubscrbtionInfo");
        String pkg = "1 Year, 900 SR";
        Subscribe instance = new Subscribe();
        instance.printSubscrbtionInfo(pkg);
     
    }
    
}
