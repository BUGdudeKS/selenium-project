package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_locators_getText_getAttribute2 {
    public static void main(String[] args) throws InterruptedException {


        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/
driver.get("https://login1.nextbasecrm.com");
        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        String expectedLogin="Log In";

        //WebElement logginButton= driver.findElement(By.className("login-btn"));

        //                                  tagName[attribute='value']

        // Locaint loginButton using class Atributes value
      //  WebElement loginButton=driver.findElement(By.cssSelector("input[type='submit']"));

        // Locaint loginButton using class Atributes value
       // WebElement loginButton=driver.findElement(By.cssSelector("input[class='login-btn']"));

        // Locaint loginButton using class Atributes value
        // WebElement loginButton=driver.findElement(By.cssSelector("input[value='Log In']"));

        // Locaint loginButton using class Atributes value
        //                                                          tagName.clasValue
        //WebElement loginButton=driver.findElement(By.cssSelector("input.login-btn"));
        // Locaint loginButton using class Atributes value
        WebElement loginButton=driver.findElement(By.cssSelector("input[value='Log In']"));


        String loginText= loginButton.getAttribute("value");//--> Log In

        if (loginText.equals(expectedLogin)){
            System.out.println("Pass "       );
        }else {
            System.out.println("expectedLogin = " + expectedLogin);
            System.out.println("loginText = " + loginText);
            System.err.println("Fail");
        }

        Thread.sleep(2000);

        driver.close();
        //
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from
    }
}