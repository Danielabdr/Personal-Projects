package com.TMDB.tests;


import com.TMDB.pages.BasePage;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {
    @Test
    public void testDriver() {

        driver.get("https://www.themoviedb.org/");

    }

}