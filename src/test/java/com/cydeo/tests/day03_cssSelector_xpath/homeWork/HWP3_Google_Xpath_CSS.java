package com.cydeo.tests.day03_cssSelector_xpath.homeWork;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP3_Google_Xpath_CSS {
    public static void main(String[] args) throws InterruptedException {
        //Back and forth navigation
        //open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // go to https://google.com

        driver.get("https://google.com");

        //Click to Gmail from top right
       // WebElement gmailXpath= driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&amp;ogbl']"));

        //using the text of the webelement with xpath locator
        //tagName[text()='textValue']--> //tagName[.='textValue']
 WebElement gmailXpath= driver.findElement(By.xpath("//a[text()='Gmail']"));

gmailXpath.click();




        System.err.println();
        // Verify title contains : Expected -> Gmail

        String expectedTutke="Gmail";

        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedTutke)){
            System.out.println("Pass");
        }else {
            System.out.println("expectedTutke = " + expectedTutke);
            System.out.println("actualTitle = " + actualTitle);
            System.err.println("Fail");
        }
Thread.sleep(2000);
        //go back to google using the .back();
        driver.navigate().back();

        // verify title equals--> expected Google
String titleExpexted= "Google";
String titleactual= driver.getTitle();

if (titleactual.equals(titleExpexted)){
    System.out.println("Pass");
}else {
    System.err.println("Fail");
}

Thread.sleep(2000);






    }
}
