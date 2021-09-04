package com.mypackage.se;

import org.testng.annotations.*;

public class Testcase1_with_Annotations {

    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before every class");

    }
    @AfterClass
    void afterClass(){
        System.out.println("This will execute after every class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method");
    }

    @Test
    void testcase1(){
        System.out.println("This is my Test Case1");
    }

    @Test
    void testcase2(){
        System.out.println("This is my Test Case2");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("This will execute before every Test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This will test after every Test");
    }


    @BeforeSuite
    void beforeSuite(){
        System.out.println("This will execute before every TestSuite");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("This will test after every TestSuite");
    }
}
