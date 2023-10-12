package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_T2_T3_Alert_Practices {
WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @AfterMethod
    public void teardownMethod(){
        driver.close();
    }


    @Test
    public void information_alert_test1(){
        //TC #1: Information alert practice

        //3. Click to “Click for JS Alert” button
        WebElement informationAlertButton= driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();

        //4. Click to OK button from the alert
        Alert alert=driver.switchTo().alert();
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //failuire message will only be dispolayed if assertion failes
        Assert.assertTrue(resultText.isDisplayed(),"Result text is not displayed ");

        String expectedText="You successfully clicked an alert";
        String actualText=resultText.getText();

        Assert.assertEquals(actualText, expectedText," Acutal restult text is not Expected");

    }

@Test
    public void confirmation_alert_test2(){
        //TC #2: Confirmation alert practice

    //3. Click to “Click for JS Confirm” button
    WebElement confirmationAlert= driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
    confirmationAlert.click();

    //4. Click to OK button from the alert
    Alert alert= driver.switchTo().alert();
    alert.accept();


    //5. Verify “You clicked: Ok” text is displayed.
    WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));
    Assert.assertTrue(resultText.isDisplayed());
}


}
