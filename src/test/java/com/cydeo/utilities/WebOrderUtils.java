package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebOrderUtils {
    //TC #2: Web table practice Task1 cont.
    //1. Create a new class called WebTableUtils.
    //2. Create two methods to verify order


    //Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    public static String returnOrderDate(WebDriver driver,String custumerName){

       String locator="//td[.='"+custumerName+"']/following-sibling::td[3]";
        WebElement customerDataCell= driver.findElement(By.xpath(locator));

        return customerDataCell.getText();

  }

    //same as above but in one line
  //public static String returnOrderDate(WebDriver driver,String custumerName){
       // return driver.findElement(By.xpath("//td[.='"+custumerName+"']/following-sibling::td[3]")).getText();
  //}


    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){
        //Method #2 info:
        //• Name: orderVerify ()
        //• Return type: void
        //• Arg1: WebDriver driver
        //• Arg2: String costumerName
        //• Arg3: String expectedOrderDate
        //This method should accept above mentioned arguments and internally assert
        //expectedOrderDate matching actualOrderDate.

        String locator="//td[.='"+customerName+ "']/following-sibling::td[3]";

        WebElement customerDateCell= driver.findElement(By.xpath(locator));

        String actualOrderDate= customerDateCell.getText();

        Assert.assertEquals(actualOrderDate,expectedOrderDate);

    }

}
