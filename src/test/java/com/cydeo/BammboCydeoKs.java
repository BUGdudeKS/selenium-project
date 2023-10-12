package com.cydeo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Scanner;

public class BammboCydeoKs {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        Thread.sleep(2000);


        driver.get("https://cydeoks.bamboohr.com/login.php");
        Thread.sleep(1000);

        WebElement email= driver.findElement(By.xpath("//input[@id='lemail']"));
        email.click();
        email.sendKeys("gentrit@cydeo.com");
        Thread.sleep(1000);

        WebElement password= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.click();
        password.sendKeys("Cybertek1*");
        Thread.sleep(1000);

        WebElement loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        Thread.sleep(2000);

        String expectedResult= "https://cydeoks.bamboohr.com/home";
        String actualResult="https://cydeoks.bamboohr.com/auth/trusted_browser?r=%2Fhome%2F";

        if (actualResult.equals(expectedResult)){
            System.out.println("Pass");
        }else {
            WebElement trustAuth= driver.findElement(By.xpath("//span[@class='jss-a43']"));
            Thread.sleep(1000);
            trustAuth.click();
            System.out.println("You are on the dashboard now");
        }
Thread.sleep(1000);

// if clockedIN

     /*   WebElement clockInButton= driver.findElement(By.xpath("//button[@data-bi-id='home-timesheet-widget-clock-in-button']"));
        clockInButton.click();
        Thread.sleep(1000);
*/

        // when user is clocked in = //button[@disabled data-bi-id='home-timesheet-widget-clock-in-button'] --> CLOCKED IN

        // entry data
        WebElement addTimeEntry = driver.findElement(By.xpath("//button[@data-bi-id='home-add-time-entry']"));

        addTimeEntry.click();

        WebElement sendClockIn= driver.findElement(By.xpath("//input[@id='clockField7']"));
        sendClockIn.sendKeys("3");
        Thread.sleep(1000);

        String expectedTogglePM= "PM";
        String actualToggle= driver.findElement(By.xpath("//div[@class='fab-SelectToggle__content']")).getText();
        System.out.println("You are about to add entry");
        if (actualToggle.contains(expectedTogglePM)){
            System.out.println("Good");
        }else {
            WebElement toggle=driver.findElement(By.xpath("//div[@class='fab-SelectToggle__toggleButton']"));
            toggle.click();
            WebElement PM= driver.findElement(By.xpath("//div[text()='PM']"));
        PM.click();
            System.out.println("You just clocked in at 03:00 PM");

        }
        Thread.sleep(1000);

        WebElement pmSendkeys=driver.findElement(By.xpath("//input[@id='clockField14']"));
        pmSendkeys.click();
        pmSendkeys.sendKeys("11");
        Thread.sleep(1000);

WebElement save=driver.findElement(By.xpath("//button[@class='jss-t12 jss-t32 jss-t15 MuiButton-root jss-t21 MuiButton-contained jss-t22 MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButtonBase-root  css-3zk1ar']"));
save.click();

        System.out.println("You just Clocked out at 11:00 PM");

        System.out.println("Test finished succesfully");


        driver.close();


    }
}
