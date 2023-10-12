package com.cydeo.tests.day02_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP4_Class_Locator_Practice {
    public static void main(String[] args) throws InterruptedException {
        // open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // go to https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");
        // click to "Home" link
        WebElement Homelink= driver.findElement(By.className("nav-link"));
        Thread.sleep(2000);
        //click
        Homelink.click();
        Thread.sleep(2000);
        // verify titles is as expected: "Practice"
            String expectedTitle= "Practice";
            String actualTtile=driver.getTitle();

            if (actualTtile.equals(expectedTitle)){
                System.out.println("Pass");
            }else {
                System.out.println("Fail");
            }
driver.close();


        // PS Locate "Home" link using "clasName" locator




    }
}
