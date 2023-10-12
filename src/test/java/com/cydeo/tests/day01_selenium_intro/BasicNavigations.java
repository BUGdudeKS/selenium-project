package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //create instance of chrime driver
        WebDriver driver=new ChromeDriver();

        //maximise window
        driver.manage().window().maximize();

        // go to tesla.com
        driver.get("https://www.tesla.com");
        // use getCurentUrl method to print out current url
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //get title of the page
       // System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // use navigaate back() to go back
        driver.navigate().back();

        //stop execution for 3 seconds
        Thread.sleep(3000);


        // use navigate forward() to go forward
        driver.navigate().forward();

//stop execution for 3 seconds
        Thread.sleep(3000);

        //user refreshes the page using navigate.refresh()'
        driver.navigate().refresh();

        //stop execution for 3 seconds
        Thread.sleep(3000);

        // navigate to google.com using navigate().to();
        driver.navigate().to("https://www.google.com");

        // use getCurentUrl method to print out current url
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        //stop execution for 3 seconds
        Thread.sleep(3000);

        driver.close();

    }
}
