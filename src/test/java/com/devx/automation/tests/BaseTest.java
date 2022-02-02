package com.devx.automation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void cleanUp()
    {
        driver.quit();
    }
}
