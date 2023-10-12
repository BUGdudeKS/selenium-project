package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practices {
    public static void main(String[] args) throws InterruptedException {

        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        // locate "Home" link, using cssSelector, syntax1, class attribute value
        WebElement homeLink_ex1= driver.findElement(By.cssSelector("a[class='nav-link']"));

        // locate "Home" link, using cssSelector, syntax2, (tagName.classValue)
        WebElement homeLink_ex2= driver.findElement(By.cssSelector("a.nav-link"));

        // locate "Home" link, using cssSelector, syntax3, href attribut value
        WebElement homeLink_ex3= driver.findElement(By.cssSelector("a[href='/']"));


        //b. “Forgot password” header
        //locat header using xpath, using text of h2
        WebElement header_ex1= driver.findElement(By.xpath("//h2[.='Forgot Password']"));


        //locate header using css selecotr , locate parent element and move to h2
        WebElement header_ex2= driver.findElement(By.cssSelector("div[class='example']>h2"));

//locate header using css selecotr syntax2, locate parent element and move to h2
        WebElement header_ex3= driver.findElement(By.cssSelector("  div.example>h2"));


        //c. “E-mail” text
        // locat email label using xpath
        WebElement emailLabelex1= driver.findElement(By.xpath("//label[@for='email']"));

        WebElement emailLabelex2= driver.findElement(By.xpath("//label[.='E-mail']"));

        //d. E-mail input box
        //locat the email input box using xpath
        WebElement emailInputex1= driver.findElement(By.xpath("//input[@name='email']"));

//locat the email input box using xpath contaions method
       // tagname[contains(@attribute, 'value')]
        WebElement emailInputex2= driver.findElement(By.xpath("//input[contains(@pattern, 'a-z')]"));

        //e. “Retrieve password” button
        WebElement passwordRetrive= driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement powerdbycydoe= driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        //4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabelex1.isDisplayed() = " + emailLabelex1.isDisplayed());
        System.out.println("emailInputex1.isDisplayed() = " + emailInputex1.isDisplayed());
        System.out.println("passwordRetrive.isDisplayed() = " + passwordRetrive.isDisplayed());
        System.out.println("powerdbycydoe.isDisplayed() = " + powerdbycydoe.isDisplayed());



        Thread.sleep(3000);
driver.close();



        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible
    }
}
