package com.mypackage.se;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class runFromMain {
    public static void main(String[] args) {

        TestNG testSuite = new TestNG();
        List<String> suitefiles = new ArrayList<String>();
        suitefiles.add("testng.xml");
        testSuite.setTestSuites(suitefiles);
        testSuite.run();
    }
}
