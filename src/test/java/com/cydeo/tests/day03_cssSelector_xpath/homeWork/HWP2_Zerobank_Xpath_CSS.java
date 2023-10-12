package com.cydeo.tests.day03_cssSelector_xpath.homeWork;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP2_Zerobank_Xpath_CSS {
    public static void main(String[] args) {
        //zero bank header verification
        //open chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");



        // Verify header Text
        //solution with xpath
        //WebElement headerText= driver.findElement(By.xpath("//h3"));
//solution with css lcoator
        WebElement headerText= driver.findElement(By.cssSelector("h3"));

        //expected: "Log in to ZeroBank"
        String expectedHeader="Log in to ZeroBank";
        String actualExpexted= headerText.getText();
        if (actualExpexted.equals(expectedHeader)){
            System.out.println("Pass");
        }else{
            System.err.println("Fail");
        }


    }
}
