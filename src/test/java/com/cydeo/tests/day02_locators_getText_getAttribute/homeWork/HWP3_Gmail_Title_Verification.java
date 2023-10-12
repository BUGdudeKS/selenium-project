package com.cydeo.tests.day02_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP3_Gmail_Title_Verification {
    public static void main(String[] args) {
        //open chrome broswer
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        // go to https://google.com
        driver.get("https://google.com");

        // click to Gmail from top right
        WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
        // click on gmail
        gmailLink.click();


        //Verify title contains Expected : "Gmail"

          String expectedGmailTitle="Gmail";
          String actualGmailTitle= driver.getTitle();

          if (actualGmailTitle.contains(expectedGmailTitle)){
              System.out.println("Passed");
          }else {
              System.out.println("Fail");
          }
        //Go back to Google by using the .back();
        driver.navigate().back();

        // verify title equals Expected "Google"
       String expectedGoogleTitle="Google";
       String actualTitle=driver.getTitle();
       if (actualTitle.equals(expectedGoogleTitle)){
           System.out.println("Passed");
       }else{
           System.out.println("Failed");
       }



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
    }

}
