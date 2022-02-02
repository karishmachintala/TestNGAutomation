package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;
    public void verifyHomePage()
    {
        WebElement homePageLogo = driver.findElement(By.className("app_logo"));
        WebElement homePageTitle = driver.findElement(By.cssSelector(".title"));

        Assert.assertTrue(homePageLogo.isDisplayed(), "Logo is missing from HomePage");
        Assert.assertTrue(homePageTitle.isDisplayed(), "Title is missing from HomePage");
    }

    public void clickOnBurgerMenu()
    {
        WebElement hamburgerEle = driver.findElement(By.id("react-burger-menu-btn"));
        hamburgerEle.click();


    }
    public void clickOnLogoutMenu()
    {
        WebElement logoutEle = driver.findElement(By.id("logout_sidebar_link"));
        logoutEle.click();
    }
}
