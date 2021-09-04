package com.mypackage.se;

import org.testng.annotations.Test;

public class Test5 {

    @Test(priority = 0)
    void setup()
    {
        System.out.println("Opening the Browser");
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
        System.out.println("Closing the Browser..You have successfully executed the Testing with Annotations...");
    }
}

