package com.tests;

import com.config.Driver;
import com.pages.BasePage;
import com.pages.FlightsPage;
import com.pages.ResultPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTests {
    Driver driver;

    private BasePage basePage;
    private FlightsPage flightsPage;
    private ResultPage resultPage;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser"})
    public void setUpDriver(String browser){
        driver = new Driver(browser);
        basePage = new BasePage(driver.getDriver());
    }

    @AfterSuite(alwaysRun = true)
    public void close(){
        driver.getDriver().quit();
    }

    public BasePage getBasePage() {
        return basePage;
    }

    public FlightsPage getFlightsPage() {
        return flightsPage;
    }

    public ResultPage getResultPage() {
        return resultPage;
    }
}
