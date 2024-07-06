package com.mystore.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.mystore.actiondriver.Action;


public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;


    @BeforeTest
    public static void loadConfig() {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("/Users/aseempathak/Downloads/Java-automation-Framework/Configuration/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load properties file");
        }
    }

   public static void launchApp() {

       WebDriverManager.chromedriver().setup();
       String browsername = prop.getProperty("browser");
       if (browsername != null) {
           if (browsername.contains("Chrome")) {
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
           } else if (browsername.contains("Firefox")) {
               WebDriverManager.firefoxdriver().setup();
               driver = new FirefoxDriver();

           } else if (browsername.contains("IE")) {
               WebDriverManager.iedriver().setup();
               driver = new InternetExplorerDriver();
           }
           driver.manage().window().maximize();
           Action.implicitWait(driver, 10);
           Action.pageLoadTimeOut(driver, 30);
           driver.get(prop.getProperty("url"));
       }
       else {
           System.out.println("Browser name is null. Please check the config.properties file.");
       }
   }
    }
