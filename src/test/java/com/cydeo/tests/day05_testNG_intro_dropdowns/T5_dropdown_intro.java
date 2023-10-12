package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_dropdown_intro {
WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //TC #5: Verifying "Simple dropdown" and "State selection" dropdown default values
        //1.Open Chrome browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        //2.Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }
    @AfterMethod
    public void teardownMethod(){
        driver.quit();
    }

    @Test
    public void simple_dropdown_test(){

//3. Verify “Simple dropdown” default selected value is correct

        //locating dropdown as a web eleemnt
        WebElement simpleDropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        //Creating Select class object, and passiong dropdown web element into the constructor

        Select select =new Select(simpleDropdown);

        //Expected: “Please select an option”
        String expectedDefaultValue="Please select an option";

        //Actual:
        String actualDefaultValue=select.getFirstSelectedOption().getText();

        // do our Assertion

        Assert.assertEquals(actualDefaultValue,expectedDefaultValue);
        Assert.assertTrue(actualDefaultValue.equals(expectedDefaultValue));


//4. Verify “State selection” default selected value is correct
//Expected: “Select a State”
        // create select object, and also locate the dropdown itself in my cosntructor
        Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));
            // Expected Select a State
        String expextedDefaultStateValue="Select a State";
            //Actual:
        String actualDefaultlStateVale= stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDefaultlStateVale,expextedDefaultStateValue);



    }
}
