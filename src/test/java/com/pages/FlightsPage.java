package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightsPage extends BasePage{

    public FlightsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID,using = "location-field-leg1-origin-input")
    public WebElement leavingFromTxt;

    @FindBy(how = How.ID,using = "location-field-leg1-destination-input")
    public WebElement goingToTxt;

    @FindBy(how = How.ID,using = "d1")
    public WebElement departingDate;

    @FindBy(how = How.ID,using = "d2")
    public WebElement returningDate;

    @FindBy(how = How.CSS,using = "button[data-stid='date-picker-paging']:last-of-type")
    public WebElement nextDateOption;

    @FindBy(how = How.CSS,using = ".uitk-date-picker-month:last-of-type tbody tr:nth-of-type(4) td")
    public WebElement selectedDate;

    @FindBy(how = How.CSS,using = "button[data-stid='apply-date-picker']")
    public WebElement doneDate;

    @FindBy(how = How.CSS,using = "button[data-testid='submit-button']")
    public WebElement searchBtn;

}
