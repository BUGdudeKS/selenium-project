package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

/*
this class will be storing only the utilities methods that can be used across the project

 */
public class BrowserUtils {
/*
this method willa ccept int)in seconds
and execute thread.sleep method for given duration
Arg: int seconds
 */
    public static void sleep(int second){
        second*=1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }


    public static void switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedInTitle){


        //return and store all window handles ina  Swet
        Set<String> allWindowHandles=driver.getWindowHandles();

        for (String each: allWindowHandles){
            driver.switchTo().window(each);
            System.out.println("Current url: "+driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedInURL)){
                break;
            }

        }

        //5. Assert: Title contains “Etsy”
        String actualTitle= driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }


}
