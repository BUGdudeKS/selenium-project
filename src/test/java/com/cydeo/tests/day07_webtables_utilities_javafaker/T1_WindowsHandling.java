package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class T1_WindowsHandling {

    //TC #1: Window Handle practice
WebDriver driver;


    @BeforeMethod
    public void setupMethod(){

            //1. Open browser
            driver= WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

            //2. Go to website: https://amazon.com
            driver.get("https://amazon.com");
        }
    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

    @Test
    public void window_handling_test(){
        //3. Copy paste the lines from below into your class
        //These lines will simply open new tabs using something called JavascriptExecutor
        //and get those pages. We will learn JavascriptExecutor later as well.
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open
        //return and store all window handles ina  Swet
        Set<String> allWindowHandles=driver.getWindowHandles();

        for (String each: allWindowHandles){
            driver.switchTo().window(each);
            System.out.println("Current url: "+driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains("etsy")){
                break;
            }

        }

        //5. Assert: Title contains “Etsy”
        String actualTitle= driver.getTitle();
        String expectedTitle="Etsy";

        Assert.assertTrue(actualTitle.contains(expectedTitle));







    }

    @Test
    public void window_handling_test2(){
        //3. Copy paste the lines from below into your class
        //These lines will simply open new tabs using something called JavascriptExecutor
        //and get those pages. We will learn JavascriptExecutor later as well.
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");


    }



}
