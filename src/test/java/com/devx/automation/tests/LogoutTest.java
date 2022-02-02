package com.devx.automation.tests;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    public  void verifyUserCanLogout()
    {

        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();

        loginPage.doLogin();

        homePage.verifyHomePage();
        homePage.clickOnBurgerMenu();
        homePage.clickOnLogoutMenu();

        loginPage.verifyLoginPage();
    }


}
