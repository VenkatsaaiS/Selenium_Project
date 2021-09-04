package com.mypackage.se;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abstraction_in_Selenium {

    WebDriver driver;

    public static void main(String[] args) {

        Abstraction_in_Selenium abstraction_in_selenium= new Abstraction_in_Selenium();
        abstraction_in_selenium.login();
        abstraction_in_selenium.logout();


    }

    public void login()  {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\venka\\Desktop\\chromedriver_win32\\chromedriver.exe");
       //instantiating headless browser...
        //  ChromeOptions chromeOptions=new ChromeOptions();
        //  chromeOptions.setHeadless(true);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationpractice.com/index.php");

         //login and entering the credentials....
        driver.findElement(By.cssSelector("a.login")).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys("gregehobrebu-5700@yopmail.com");
        //driver.findElement(By.cssSelector("input.a-button-input")).click();
        driver.findElement(By.cssSelector("input#passwd")).sendKeys("123456789");
        driver.findElement(By.cssSelector("button#SubmitLogin")).click();


    }

    public void logout()   {
                   // logout.....
         driver.findElement(By.xpath("//a[text()='Sign out']")).click();

     driver.close();

        }
    }




