package com.TMDB.tests;

import com.TMDB.basePage.BasePage;
import com.TMDB.loginPage.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BasePage {
    private LoginPage loginPage;

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        loginPage.goToLoginLink();
        loginPage.enterUsername("Danielabdr");
        loginPage.enterPassword("Tmdb1994@#@#");
        loginPage.clickLoginButton();

        // Add assertions here to verify successful login
        // For example:
        // softAssert
    }
}