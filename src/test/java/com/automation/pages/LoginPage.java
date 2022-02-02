package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    public void doLogin() {
        WebElement userNameEle = driver.findElement(By.id("user-name"));
        userNameEle.sendKeys("standard_user");
        WebElement passwordEle = driver.findElement(By.id("password"));
        passwordEle.sendKeys("secret_sauce");
        WebElement loginEle = driver.findElement(By.id("login-button"));
        loginEle.click();
    }

    public void verifyLoginPage()
    {
        WebElement userNameEle = driver.findElement(By.id("user-name"));
        WebElement passwordEle = driver.findElement(By.id("password"));
        Assert.assertTrue(userNameEle.isDisplayed(), "Username input is missing from login page");
        Assert.assertTrue(passwordEle.isDisplayed(), "Password input is missing from login page");
    }
}
