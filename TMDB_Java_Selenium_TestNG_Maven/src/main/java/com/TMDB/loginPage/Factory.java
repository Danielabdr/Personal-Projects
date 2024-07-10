package com.TMDB.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.TMDB.loginPage.Constants.*;

public class Factory {
    @FindBy(css = USERNAME_INPUT)
    public WebElement username;

    @FindBy(css = PASSWORD_INPUT)
    public WebElement password;

    @FindBy(css = LOGIN_BUTTON)
    public WebElement loginButton;


    public Factory(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
