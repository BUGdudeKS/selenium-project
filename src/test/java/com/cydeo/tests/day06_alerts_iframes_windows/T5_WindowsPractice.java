package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_WindowsPractice {
    //1. Create a new class called: T5_WindowsPractice


    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/windows");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }


    //TC #5: Window Handle practice

@Test
        public void multiple_windows_test(){
    //4. Assert: Title is “Windows”
    String expectedTitle="Windows";
    String actualTitle=driver.getTitle();

    Assert.assertEquals(actualTitle,expectedTitle);

    String mainHandle= driver.getWindowHandle();
    System.out.println("mainHandle = " + mainHandle);

    System.out.println("title before click: "+driver.getTitle());

    //5. Click to: “Click Here” link
    WebElement clickHereLink= driver.findElement(By.linkText("Click Here"));
    clickHereLink.click();

    System.out.println("title after click: "+driver.getTitle());

    //6. Switch to new Window. we need to use driver.getWindowsHandele()method
    //driver.getWindowHandles();
    //1- windowHandle : mainHandle
    //2- windowHandle : 2nd window

    for (String each: driver.getWindowHandles()) {
        driver.switchTo().window(each);
        System.out.println("Current title while switching windows: "+driver.getTitle());

    }
    //7. Assert: Title is “New Window”
    String expectedTitleAfterClick="New Window";
    actualTitle= driver.getTitle();

    Assert.assertEquals(actualTitle,expectedTitleAfterClick);
//if we have to go back to amin page to contioune our test
// we can use main handle to swithch
    driver.switchTo().window(mainHandle);
    //code
}

}

