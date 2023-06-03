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
public class ScheduleTest {
    
    public ScheduleTest() {
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
     * Test of getSchedule_num method, of class Schedule.
     */
    @Test
    public void testGetSchedule_num() {
        System.out.println("getSchedule_num");
        Schedule instance = new Schedule(1,"2AM","fay mohammed", "wensday");
        int expResult = 1;
        int result = instance.getSchedule_num();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setSchedule_num method, of class Schedule.
     */
    @Test
    public void testSetSchedule_num() {
        System.out.println("setSchedule_num");
        int schedule_num = 0;
        Schedule instance = new Schedule();
        instance.setSchedule_num(schedule_num);
        
    }

    /**
     * Test of getTime method, of class Schedule.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        Schedule instance = new Schedule(1,"2AM","fay mohammed", "wensday");
        String expResult = "2AM";
        String result = instance.getTime();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setTime method, of class Schedule.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "";
        Schedule instance = new Schedule();
        instance.setTime(time);
        
    }

    /**
     * Test of getName_trainer method, of class Schedule.
     */
    @Test
    public void testGetName_trainer() {
        System.out.println("getName_trainer");
        Schedule instance = new Schedule(1,"2AM","fay mohammed", "wensday");
        String expResult = "fay mohammed";
        String result = instance.getName_trainer();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName_trainer method, of class Schedule.
     */
    @Test
    public void testSetName_trainer() {
        System.out.println("setName_trainer");
        String name_trainer = "";
        Schedule instance = new Schedule(1,"2AM","fay mohammed", "wensday");
        instance.setName_trainer(name_trainer);
        
    }

    /**
     * Test of getWorkoutplans method, of class Schedule.
     */
    @Test
    public void testGetWorkoutplans() {
        System.out.println("getWorkoutplans");
        Schedule instance = new Schedule(1,"2AM","fay mohammed", "wensday");
        String expResult = "wensday";
        String result = instance.getWorkoutplans();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setWorkoutplans method, of class Schedule.
     */
    @Test
    public void testSetWorkoutplans() {
        System.out.println("setWorkoutplans");
        String Workoutplans = "";
        Schedule instance = new Schedule();
        instance.setWorkoutplans(Workoutplans);
       
    }

    /**
     * Test of planA method, of class Schedule.
     */
    @Test
    public void testPlanA() {
        System.out.println("planA");
        Schedule instance = new Schedule();
        instance.planA();
       
    }

    /**
     * Test of planB method, of class Schedule.
     */
    @Test
    public void testPlanB() {
        System.out.println("planB");
        Schedule instance = new Schedule();
        instance.planB();
       
    }

    /**
     * Test of planC method, of class Schedule.
     */
    @Test
    public void testPlanC() {
        System.out.println("planC");
        Schedule instance = new Schedule();
        instance.planC();
      
    }

    /**
     * Test of available_plans method, of class Schedule.
     */
    @Test
    public void testAvailable_plans() {
        System.out.println("available_plans");
        Schedule instance = new Schedule();
        instance.available_plans();
       
    }
    
}
