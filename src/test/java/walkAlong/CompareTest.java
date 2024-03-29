/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package walkAlong;

import Service.Compare;
import Service.trueFalse;
import config.CompareConfig;
import config.TrueFalseConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class CompareTest {
    
    private static Compare objCompare;
    
    public CompareTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void compareIt() 
     {
         Assert.assertNotSame(objCompare.toMatch("what") ,objCompare.toMatch2("hgf"));
         
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CompareConfig.class);
        objCompare = (Compare) ctx.getBean("ItsTheSame");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
