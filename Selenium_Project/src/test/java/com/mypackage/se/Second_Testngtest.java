package com.mypackage.se;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Second_Testngtest {

    @Test(priority =4)
    void teardown(){

        System.out.println("Closing the Browser Window");
    }
    @Test(priority = 2)
    void homepage(){

        System.out.println("This is my HomePage Test");
        Assert.assertEquals(1,1);

    }
    @Test(priority = 3)
    void checkbook(){

        System.out.println("This is my checking balance Test");
    }
    @Test(priority = 1)
    void setup(){

        System.out.println("Opening the Browser Window");
    }
}