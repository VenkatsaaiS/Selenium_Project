package com.mypackage.se;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {

    WebDriver driver=null;

    @BeforeTest
    void registrationPage() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    void login() {

        driver.get("http://demo.automationtesting.in/Index.html");

        driver.findElement(By.id("email")).sendKeys("gopallulu263@yopmail.com");
        driver.findElement(By.id("enterimg")).click();

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vincent");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Malhotra");
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Huzurnagar");
        driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("gopallulu263@yopmail.com");
        driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9848122332");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("checkbox2")).click();
        //   Select Language= new Select(driver.findElement(By.xpath("//*[@id=\"msdd\"]")));
        //  Language.selectByVisibleText("English");
        Select Skills = new Select(driver.findElement(By.id("Skills")));
        Skills.selectByValue("Java");
        Select Country = new Select(driver.findElement(By.id("countries")));
        Country.selectByValue("India");
        Select SelectCountry = new Select(driver.findElement(By.id("country")));
        SelectCountry.selectByVisibleText("India");
        Select Year = new Select(driver.findElement(By.id("yearbox")));
        Year.selectByValue("1992");
        Select Month = new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
        Month.selectByValue("November");
        Select Day = new Select(driver.findElement(By.id("daybox")));
        Day.selectByValue("18");
        driver.findElement(By.id("firstpassword")).sendKeys("P123456789d");
        driver.findElement(By.id("secondpassword")).sendKeys("P123456789d");
        driver.findElement(By.id("submitbtn")).click();
    }

    @AfterTest
    void tearDown(){
    //    Assert.assertEquals(driver.getTitle(),"Register");
        System.out.println("Registration Successful...Thanks for registering with Automation Testing.");

        driver.close();
    }
}
