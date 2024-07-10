package com.TMDB.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.TMDB.loginPage.Constants.*;

public class LoginPage {
    public WebDriver driver;
    public Factory elements;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.elements = new Factory(driver);
    }

    public void goToLoginLink(){
        this.driver.get("https://www.themoviedb.org/login");
    }

    public void enterUsername(String username){
        elements.username.sendKeys(username);
    }

    public void enterPassword(String password){
        elements.password.sendKeys(password);
    }

    public void clickLoginButton(){
        elements.loginButton.click();
    }
}
