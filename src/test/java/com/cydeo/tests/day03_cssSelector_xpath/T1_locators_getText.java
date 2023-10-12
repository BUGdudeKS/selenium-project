package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {

        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
    //    WebDriverManager.chromedriver().setup();
        //WebDriver driver=new ChromeDriver();

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Enter incorrect username: “incorrect”
        WebElement inputUsernmae= driver.findElement(By.className("login-inp"));
        inputUsernmae.sendKeys("incorrect");

        //4- Enter incorrect password: “incorrect”
WebElement inputpassword= driver.findElement(By.name("USER_PASSWORD"));
inputpassword.sendKeys("incorrect");

        //5- Click to login button.
        WebElement loginButton= driver.findElement(By.className("login-btn"));
        loginButton.click();
        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password

        String expectedErrorText="Incorrect login or password";
        String actualErrorText= driver.findElement(By.className("errortext")).getText();

        if (actualErrorText.equals(expectedErrorText)){
            System.out.println("Pass");
        }else {
            System.err.println("Failed");
        }

        driver.close();
        //
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
    }
}
