package com.TMDB.tests;

import com.TMDB.basePage.BasePage;
import com.TMDB.homepage.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {
    public HomePage homePage;

    @Test
    public void testDriver() {
        HomePage homePage1 = new HomePage();

    }
}
