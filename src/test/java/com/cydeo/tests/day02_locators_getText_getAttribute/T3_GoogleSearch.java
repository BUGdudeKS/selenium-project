package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {

        //TC#3: Google search
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");
        //3- Write “apple” in search box

        // a- locate search box
        WebElement googleSearchBox= driver.findElement(By.name("q"));

        //b- enter "apple" key and pres eneter
        googleSearchBox.sendKeys("apple");
        //4- Press ENTER to search
        googleSearchBox.sendKeys(Keys.ENTER);

        //5- Verify title:
        //Expected: Title should start with “apple” word

        String expectedBeginingOfTitle="apple";
        String actualTitle= driver.getTitle();

        if (actualTitle.startsWith(expectedBeginingOfTitle)){
            System.out.println("Title verfication Passed");
        }else{
            System.out.println("Title verification Failed");
        }



    }
}
