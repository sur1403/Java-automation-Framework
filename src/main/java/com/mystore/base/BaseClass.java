package com.mystore.base;

import com.mystore.actiondriver.Action;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.w3c.dom.DOMConfiguration;
import org.apache.log4j.xml.DOMConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class BaseClass {
    //    public static WebDriver driver;
    public static Properties prop;
    public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    @BeforeSuite
    public void beforeSuite() {
        DOMConfigurator.configure("/Users/aseempathak/Downloads/Java-automation-Framework/log4j.xml");
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

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
//                driver = new ChromeDriver();
                driver.set(new ChromeDriver());
            } else if (browsername.contains("Firefox")) {
                WebDriverManager.firefoxdriver().setup();
//                driver = new FirefoxDriver();
                driver.set(new FirefoxDriver());

            } else if (browsername.contains("IE")) {
                WebDriverManager.iedriver().setup();
//                driver = new InternetExplorerDriver();
                driver.set(new InternetExplorerDriver());
            }
            getDriver().manage().window().maximize();
            Action.implicitWait(getDriver(), 10);
            Action.pageLoadTimeOut(getDriver(), 30);
            getDriver().get(prop.getProperty("url"));
        } else {
            System.out.println("Browser name is null. Please check the config.properties file.");
        }
    }
}
