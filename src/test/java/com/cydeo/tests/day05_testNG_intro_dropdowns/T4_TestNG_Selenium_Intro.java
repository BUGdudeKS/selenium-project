package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_TestNG_Selenium_Intro {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //TC #4: Cydeo Title Verification
        //1.Open Chrome browser
         driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        //2.Go to https://www.cydeo.com
        driver.get("https://practice.cydeo.com");
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void test1_cydeo_title_verification(){

    //3.Verify title:
    //Expected: Practice
        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);


}

}
