package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) throws InterruptedException {
        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:
        //Expected: Registration form
        WebElement header= driver.findElement(By.tagName("h2"));
        String expectedHeaderText= "Registration form";
        String actualHeaderText= header.getText();//--> //will return text of the header
                if (actualHeaderText.equals(expectedHeaderText)){
                    System.out.println("Verification passed");
                }else {
                    System.out.println("Verification Failed");
                }

        //4- Locate “First name” input box
        WebElement firstNameInput= driver.findElement(By.className("form-control"));

        //5- Verify placeholder attribute’s value is as expected:
        //Expected: first name
        String expectedPlaceHolder="first name";
        String actualPlaceHolder=firstNameInput.getAttribute("placeholder");
        System.out.println("actualPlaceHolder = " + actualPlaceHolder);

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Placeholder attribute verification passed");

        }else {
            System.out.println("Placeholder attribute verification Failed");
        }

        Thread.sleep(3000);
        driver.close();
    }
}
