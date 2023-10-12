package com.cydeo.tests.day02_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_ZeroBank_Header {
    public static void main(String[] args) {
        //open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // verify header text
        // expexted :"Log in to ZeroBank"
        WebElement headerText= driver.findElement(By.tagName("h3"));
        String expectedHeader="Log in to ZeroBank";
        String actualHeader= headerText.getText();
        //verification of actual vs expected
        if (actualHeader.equals(expectedHeader)){
            System.out.println("Passed");
        }else {
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
