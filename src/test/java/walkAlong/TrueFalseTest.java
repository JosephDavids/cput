/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package walkAlong;

import Service.trueFalse;
import config.TrueFalseConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;
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
public class TrueFalseTest {
    
    private static trueFalse objTF;
    
    public TrueFalseTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void getAnswerTF() 
     {
         Assert.isTrue(objTF.theAnswerWas());
         
         
     }
     @Test
     public void getAnswerT()
     {
         Assert.state(objTF.returnFalse());
     }
     
     @Test 
     public void CompareAnswers()
     {
         assertEquals(objTF.returnFalse(),objTF.theAnswerWas());
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TrueFalseConfig.class);
        objTF = (trueFalse) ctx.getBean("whatIsIt");
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
