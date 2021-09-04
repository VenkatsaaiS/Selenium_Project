package com.mypackage.se;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependencyTest_Examples {

    @Test(priority = 0)
    void insertCard()
    {
        System.out.println("Insert ATM Card");
      // Assert.fail();
    }

    @Test(priority = 3,dependsOnMethods = {"insertCard"})
    void selectLanguage()
    {
        System.out.println("Select Language");
    }

    @Test(priority = 5,dependsOnMethods ={"insertCard", "selectLanguage"})
    void transactionType()
    {
        System.out.println("Select type of Transaction");
    }

    @Test(priority = 6,dependsOnMethods ={"selectLanguage", "transactionType"})
    void accountType()
    {
        System.out.println("Select Account  type");
    }

    @Test(priority = 8,dependsOnMethods = {"transactionType","accountType"})
    void pin()
    {
        System.out.println("Enter 4 digit ATM Pin");
    }

    @Test(priority = 9,dependsOnMethods ={"pin","accountType"})
    void collectCash()
    {
        System.out.println("Collect cash Amount");
    }

    @Test(priority = 20,dependsOnMethods ={"collectCash", "pin"})
    void ejectCard()
    {
        System.out.println("Remove the Card");
    }
}
