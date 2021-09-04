package com.mypackage.se;

import org.testng.annotations.Test;

public class First_Testngtest {

    @Test(priority = 2)
    void teardown(){

        System.out.println("Closing the Browser Window");
    }
    @Test(priority = 1)
    void login(){

        System.out.println("This is my Login Test");
    }
    @Test(priority = 0)
    void setup(){

        System.out.println("Opening the Browser Window");
    }
}
