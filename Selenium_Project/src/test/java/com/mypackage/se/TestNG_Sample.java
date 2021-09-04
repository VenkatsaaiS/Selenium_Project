package com.mypackage.se;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_Sample {

    @Test(priority = 0)
    void setup()
    {

        System.out.println("Opening the Browser");
        try {
            Assert.assertEquals("venkatasai", "Venkatasai");
        }
        catch (Throwable t){
            System.out.println(t);
        }
       System.out.println("After Assert Condition");
      //  Assert.assertEquals(1,2);
      //  Assert.assertTrue(1>4);
    //    Assert.assertFalse(4>1);
    }

    @Test(priority = 1)
    void login()
    {
        System.out.println("This is my login Test");
    //    throw new SkipException("Login Test Functionality is not supported");
    }

    @Test(priority = 4)
    void teardown()
    {
        System.out.println("Closing the Browser");
    }
}
