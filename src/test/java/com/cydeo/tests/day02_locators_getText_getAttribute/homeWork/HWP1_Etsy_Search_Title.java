package com.cydeo.tests.day02_locators_getText_getAttribute.homeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP1_Etsy_Search_Title {
    public static void main(String[] args) throws InterruptedException {
      //  1. open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

      // 2. go to https://www.etsy.com
        driver.get("https://www.etsy.com");

      //  3. search for "wooden spoon"
        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);

      //  4. Verify title:
      //              expected: "Wooden spoon - Etsy"
        String expectedTitle="Wooden spoon - Etsy";
        String actualTitle= driver.getTitle();

        // create simple if condiention to comapre
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }



Thread.sleep(3000);
        driver.close();
    }
}
