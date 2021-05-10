package com.tests;

import com.pages.BasePage;
import com.pages.FlightsPage;
import com.pages.ResultPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchFlight extends BaseTests{
    Logger log = Logger.getLogger("Login");

    @Test
    @Parameters({"leaving","goingTo"})
    public void searchFlight(String leaving, String goingTo){
        try {
            BasePage basePage = getBasePage();
            FlightsPage flightsPage = getFlightsPage();
            ResultPage resultPage = getResultPage();
            basePage.flightOption.click();
            flightsPage.leavingFromTxt.sendKeys(leaving);
            flightsPage.leavingFromTxt.sendKeys(Keys.ENTER);
            flightsPage.goingToTxt.sendKeys(goingTo);
            flightsPage.goingToTxt.sendKeys(Keys.ENTER);
            flightsPage.departingDate.click();
            flightsPage.nextDateOption.click();
            flightsPage.selectedDate.click();
            flightsPage.doneDate.click();
            flightsPage.searchBtn.click();
            Assert.assertTrue(resultPage.filterBy.isDisplayed());
        }catch (Exception e){
            log.error(e.getMessage());
        }
    }

    @Test
    public void thereIsAbox(){
        String[] options = {"Price","Departure","Arrival","Duration"};
        ResultPage resultPage = getResultPage();
        int assertions = 0;
        for(int i=0;i<resultPage.optionsOrder.size();i++){
            for(int j=0;j<options.length;j++){
                if(resultPage.optionsOrder.get(i).getText().contains(options[j])){
                    assertions = assertions++;
                    break;
                }
            }
        }
        Assert.assertTrue(assertions ==4 );
    }

}
