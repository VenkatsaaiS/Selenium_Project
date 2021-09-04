package com.mypackage.se;

import org.testng.annotations.Test;

public class Priority_Examples {

    @Test(priority = 1)
    void TestOne(){

        System.out.println("This is Test1");
    }

    @Test(priority = 6)
    void TestTwo(){

        System.out.println("This is Test2");
    }

    @Test(priority = 2)
    void TestThree(){

        System.out.println("This is Test3");
    }

    @Test(priority = 3)
    void TestFour(){

        System.out.println("This is Test4");
    }

    @Test(priority = 5)
    void TestFive(){

        System.out.println("This is Test5");
    }
}


