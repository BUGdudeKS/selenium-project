package com.cydeo.tests.day03_cssSelector_xpath.homeWork;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP4_Link_Xpath_CSS {
    public static void main(String[] args) throws InterruptedException {
        // open chrome browser
       WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        // go to https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");
        // click to "Home" link
      //  WebElement Homelink= driver.findElement(By.xpath("//a[@class='nav-link']"));
       // WebElement Homelink= driver.findElement(By.xpath("//a[text()='Home']"));
        //WebElement Homelink= driver.findElement(By.linkText("Home"));
        //WebElement Homelink= driver.findElement(By.xpath("a[class='nav-link']"));

        WebElement Homelink= driver.findElement(By.cssSelector("a.nav-link"));

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



    }}
