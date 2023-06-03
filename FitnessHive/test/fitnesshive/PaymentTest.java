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
public class PaymentTest {
    
    public PaymentTest() {
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
     * Test of getPrice method, of class Payment.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Payment instance = new Payment("1234","23/5","manar",300.0);
        double expResult = 300.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of setPrice method, of class Payment.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 500.0;
        Payment instance = new Payment("1234","23/5","manar",500.0);
        instance.setPrice(price);
        double expResult = 500.0;
        double result = instance.getPrice();
        assertEquals(expResult, result,0);
       
    }

    /**
     * Test of getExpirationDate method, of class Payment.
     */
    @Test
    public void testGetExpirationDate() {
        System.out.println("getExpirationDate");
        Payment instance = new Payment("1234","30/4","sara",200.0);
        String expResult = "30/4";
        String result = instance.getExpirationDate();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setExpirationDate method, of class Payment.
     */
    @Test
    public void testSetExpirationDate() {
        System.out.println("setExpirationDate");
        String ExpirationDate = "";
        Payment instance = new Payment("987","27/9","maya",400.0);
        instance.setExpirationDate(ExpirationDate);
       
    }

    /**
     * Test of getCardNum method, of class Payment.
     */
    @Test
    public void testGetCardNum() {
        System.out.println("getCardNum");
        Payment instance = new Payment("987","27/9","maya",400.0);
        String expResult = "987";
        String result = instance.getCardNum();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setCardNum method, of class Payment.
     */
    @Test
    public void testSetCardNum() {
        System.out.println("setCardNum");
        String CardNum = "2345";
        Payment instance = new Payment("987","27/9","meshal",400.0);
        instance.setCardNum(CardNum);
       
    }

    /**
     * Test of getCardName method, of class Payment.
     */
    @Test
    public void testGetCardName() {
        System.out.println("getCardName");
        Payment instance = new Payment("95677","27/1","maya",800.0);
        String expResult = "maya";
        String result = instance.getCardName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCardName method, of class Payment.
     */
    @Test
    public void testSetCardName() {
        System.out.println("setCardName");
        String CardName = "manar";
        Payment instance = new Payment("987","27/9","maya",400.0);
        instance.setCardName(CardName);
        
    }

    /**
     * Test of Discount method, of class Payment.
     */
    @Test
    public void testDiscount() {
        System.out.println("Discount");
        double amount = 900.0;
        String discount = "IT21";
        Payment.Discount(amount, discount);
        
    }
    
    
}



    

