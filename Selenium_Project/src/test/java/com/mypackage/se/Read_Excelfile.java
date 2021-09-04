package com.mypackage.se;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Read_Excelfile {

    public static void main(String[] args) throws IOException, BiffException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

        Workbook workbook = Workbook.getWorkbook(new File("C:\\Users\\Venkatasai\\Desktop\\TestCases Sheet.xls"));

        Sheet sh= workbook.getSheet("Sheet1");

        for (int i=1;i<sh.getRows();i++)
        {
//            System.out.println("UserName is: " +sh.getCell(0,i).getContents());
//            System.out.println("Password is: " +sh.getCell(1,i).getContents());
        WebElement un= driver.findElement(By.id("txtUsername"));
        WebElement pwd= driver.findElement(By.id("txtPassword"));

        un.sendKeys(sh.getCell(0,i).getContents());
        pwd.sendKeys(sh.getCell(1,i).getContents());

        //Implicit Wait
     //   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            //Explicit Wait
//        WebDriverWait wait= new WebDriverWait(driver,10);
//        WebElement element= wait.until(ExpectedConditions.invisibilityOfAllElements(By.))
         Thread.sleep(500);
        un.clear();
        pwd.clear();

            Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        }

        driver.close();

        }
    }
