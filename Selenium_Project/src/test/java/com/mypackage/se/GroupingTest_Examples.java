package com.mypackage.se;

import org.junit.Assert;
import org.testng.annotations.Test;

public class GroupingTest_Examples {

    @Test(groups = {"Whitebox"})
    void test1(){
        System.out.println("This is Test1.");

    }
    @Test(groups = {"Whitebox"})
    void test2(){
        System.out.println("This is Test2..");
    }
    @Test(groups = {"Blackbox"})
    void test3(){
        System.out.println("This is Test3...");
    }
    @Test(groups = {"Blackbox"})
    void test4(){
        System.out.println("This is Test4....");
    }
    @Test(groups = {"Blackbox","Whitebox"})
    void test5(){
        System.out.println("This is Test5.....");
    }
}
