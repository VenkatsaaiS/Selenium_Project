package com.mypackage.se;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle_Demo {

    WebDriver driver=null;

    @Test
    void testMutipleWindows() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");
        // It will return the parent window name as a String...
        String parentwindow = driver.getWindowHandle();
        System.out.println(driver.switchTo().window(parentwindow).getTitle());
        // It returns no. of windows opened by WebDriver and will return Set of Strings...
        Set<String> s = driver.getWindowHandles();
        // Using Iterator to iterate with in windows...
        Iterator<String> i = s.iterator();
        while (i.hasNext()) {
            String childWindow = i.next();
            // Compare whether the main windows is not equal to child window. If not equal, we will close...
                    if (!parentwindow.equals(childWindow))
               {
                // Switching to Child window...
                driver.switchTo().window(childWindow);
               System.out.println(driver.switchTo().window(childWindow).getTitle());
           driver.close();
           }
       }

        //switching to the parent window...
        driver.switchTo().window(parentwindow);

        driver.close();
        }
    }
