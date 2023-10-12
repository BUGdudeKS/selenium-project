package com.cydeo.tests.day03_cssSelector_xpath.homeWork;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP1_Etsy_Xpath_CSS {
    public static void main(String[] args) {
        // Esty Title cerification
        // open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        // search wooden spoon
        //tag[@attribute='value']
        // input[@type='text']
        //WebElement searchBox= driver.findElement(By.xpath("//input[@type='text']"));

       // WebElement searchBox= driver.findElement(By.xpath("//input[@data-id='search-query']"));

        // CssSelector;
        //synatx 1 : tagNma[attributw='value']
        //syntax2 ; for id-> tag#idValue, for class: tag.classValue

        //WebElement searchBox= driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']"));

        WebElement searchBox= driver.findElement(By.cssSelector("input#global-enhancements-search-query"));



        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);



        // verify title
        //Expected "Wooden spoon - Etsy"
        String expectedTitle= "Wooden spoon - Etsy";
        String actualTtitle= driver.getTitle();

        if (actualTtitle.equals(expectedTitle)){
            System.out.println("Pass");
        }else {
            System.err.println("Fail");
        }


    }
}
