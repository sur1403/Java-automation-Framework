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
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.mystore.actiondriver.Action;


public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;


    @BeforeTest
    @Parameters("browser")
    public void loadConfig() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            // load a properties file from class path, inside static method
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

   public static void launchApp() {

       WebDriverManager.chromedriver().setup();
       String browsername = prop.getProperty("browser");

       if (browsername.contains("Chrome")) {
           driver = new ChromeDriver();
       }
       else if(browsername.contains("Firefox")){
           driver = new FirefoxDriver();

       }
       else if(browsername.contains("IE")) {
           driver = new InternetExplorerDriver();
       }
       Action.
   }
    }
