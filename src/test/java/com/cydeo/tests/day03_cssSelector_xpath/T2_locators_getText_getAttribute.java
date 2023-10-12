package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_locators_getText_getAttribute {
    public static void main(String[] args) throws InterruptedException {



        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.navigate().to("https://login1.nextbasecrm.com");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        String expectedLabelText="Remember me on this computer";
        String actualLabelText=driver.findElement(By.className("login-item-checkbox-label")).getText();

        if (actualLabelText.equals(expectedLabelText)){
            System.out.println("Passed");
        }else {
            System.err.println("Failed");
        }



        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        String expectedForgotPasswordText="FORGOT YOUR PASSWORD?";
        WebElement forgotPasswordLink= driver.findElement(By.className("login-link-forgot-pass"));
        String actualForgotpasswordText= forgotPasswordLink.getText();

        if (actualForgotpasswordText.equals(expectedForgotPasswordText)){
            System.out.println("Pass");
        }else {
            System.out.println("actualForgotpasswordText = " + actualForgotpasswordText);
            System.out.println("expectedForgotPasswordText = " + expectedForgotPasswordText);
            System.err.println("Fail");
        }


        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
String expectedInHref= "forgot_password=yes";
        String actualHrefValue=forgotPasswordLink.getAttribute("href");

        if (actualHrefValue.contains(expectedInHref)){
            System.out.println("Pass");
        }else {
            System.err.println("Fail");
        }
Thread.sleep(2000);
driver.close();
        //
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
    }
}
