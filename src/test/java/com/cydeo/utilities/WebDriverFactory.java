package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Task: New method creation
// method name; getDriver
//Static method
// accepts String art'; browserType
// this arg will determine what type of broswer is open
// if "chrome  " passed -> i will open chrome browser
// if firefox passed --> it will open firefox
// return type; Webdriver
public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else {
            System.err.println("Given string doesnt represnt any browser");
            System.err.println("either bewoser not exsost");
            System.err.println("Driver = null");
            return null;
        }


    }


}
