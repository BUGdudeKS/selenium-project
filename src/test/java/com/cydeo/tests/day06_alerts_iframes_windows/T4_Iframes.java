package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T4_Iframes {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");
    }
// @AfterMethod
//    public void teardownMethod(){
//        driver.close();
//    }
    @Test
    public void iframe_test1(){
        //TC #4: Iframe practice
        // we ahve to swoth to uphframe to be able to locakte web element
        //option 1-switch to ID attribute
       // driver.switchTo().frame("mce_0_ifr");

        //option2- swith using INDEX number
     //   driver.switchTo().frame(0);

        //option3 swith using WEBELEMENT
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
        WebElement paragraphText = driver.findElement(By.xpath("//p[.='Your content goes here.']"));


        //4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(paragraphText.isDisplayed());


        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        driver.switchTo().parentFrame();
        //driver.switchTo().defaultContent();--> almost same
        WebElement h3= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(h3.isDisplayed());

    }
}
